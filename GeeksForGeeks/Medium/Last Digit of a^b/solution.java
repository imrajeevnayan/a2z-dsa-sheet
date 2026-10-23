class Solution {

    public int getLastDigit(String a, String b) {

        // a^0 = 1 (including 0^0 for this problem)
        if (b.equals("0"))
            return 1;

        int lastDigit = a.charAt(a.length() - 1) - '0';

        // b % 4 nikal lo kyunki cycle max 4 ki hoti hai
        int mod = 0;
        for (char ch : b.toCharArray()) {
            mod = (mod * 10 + (ch - '0')) % 4;
        }

        if (mod == 0)
            mod = 4;

        int ans = 1;

        // lastDigit^mod ka last digit nikal lo
        for (int i = 0; i < mod; i++) {
            ans = (ans * lastDigit) % 10;
        }

        return ans;
    }
}