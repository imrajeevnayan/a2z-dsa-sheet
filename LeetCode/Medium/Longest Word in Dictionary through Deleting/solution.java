class Solution {
    public String findLongestWord(String s, List<String> dictionary) {

        String ans = "";

        for (String word : dictionary) {
            if (isSubsequence(s, word)) {

                if (word.length() > ans.length()  || (word.length() == ans.length()
                        && word.compareTo(ans) < 0)) {
                    ans = word;
                }
            }
        }

        return ans;
    }

    private boolean isSubsequence(String s, String word) {
        int i = 0, j = 0;

        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == word.length();
    }
}