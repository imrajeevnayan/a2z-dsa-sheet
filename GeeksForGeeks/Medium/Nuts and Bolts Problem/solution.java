class Solution {
    public void matchPairs(char[] nuts, char[] bolts) {
        char[] order = {'!', '#', '$', '%', '&', '*', '?', '@', '^'};

        HashSet<Character> set = new HashSet<>();

        for (char ch : nuts) {
            set.add(ch);
        }

        int idx = 0;

        for (char ch : order) {
            if (set.contains(ch)) {
                nuts[idx] = ch;
                bolts[idx] = ch;
                idx++;
            }
        }
    }
}