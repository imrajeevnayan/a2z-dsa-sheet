class Solution {
    public String generateTheString(int n) {
        char c = (n % 2 == 1) ? 'a' : 'b';
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n - (n % 2 == 0 ? 1 : 0); i++) {
            sb.append('a');
        }
        if (n % 2 == 0) sb.append('b');
        return sb.toString();
    }
}
