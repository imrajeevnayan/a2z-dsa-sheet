class Solution {

    public boolean isSumString(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                String first = s.substring(0, i);
                String second = s.substring(i, j);

                if (check(first, second, s.substring(j))) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(String a, String b, String remaining) {

        String sum = addStrings(a, b);

        if (!remaining.startsWith(sum)) {
            return false;
        }

        if (remaining.length() == sum.length()) {
            return true;
        }

        return check(b, sum, remaining.substring(sum.length()));
    }

    private String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}