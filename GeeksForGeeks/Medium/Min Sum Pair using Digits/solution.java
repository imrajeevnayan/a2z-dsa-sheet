class Solution {
    public String minSum(int[] arr) {

        int[] cnt = new int[10];

        for (int d : arr) {
            cnt[d]++;
        }

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        boolean turn = true;

        for (int digit = 0; digit <= 9; digit++) {
            while (cnt[digit]-- > 0) {
                if (turn) {
                    a.append(digit);
                } else {
                    b.append(digit);
                }
                turn = !turn;
            }
        }

        return addStrings(a.toString(), b.toString());
    }

    private String addStrings(String s1, String s2) {

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        res.reverse();

        int k = 0;
        while (k < res.length() - 1 && res.charAt(k) == '0') {
            k++;
        }

        return res.substring(k);
    }
}