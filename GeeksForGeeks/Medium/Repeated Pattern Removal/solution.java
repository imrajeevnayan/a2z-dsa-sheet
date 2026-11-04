class Solution {
    public String finalStr(String txt, String pat) {
        StringBuilder sb = new StringBuilder();
        int m = pat.length();

        for (char ch : txt.toCharArray()) {
            sb.append(ch);

            if (sb.length() >= m) {
                boolean match = true;

                for (int i = 0; i < m; i++) {
                    if (sb.charAt(sb.length() - m + i) != pat.charAt(i)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    sb.setLength(sb.length() - m);
                }
            }
        }

        return sb.toString();
    }
}