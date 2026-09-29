class Solution {
    public String countAndSay(int n) {
        if (n == 1)  return "1";
        
        // Recursively get (n-1)th term
        String prev = countAndSay(n - 1);

        // Process it to get nth term
        return getNextSequence(prev);
    }

    private String getNextSequence(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Don't forget the last group!
        sb.append(count).append(currentChar);

        return sb.toString();
    }
}