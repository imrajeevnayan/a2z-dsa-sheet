class Solution {

    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
    }

    public static int countSubs(String s) {

        TrieNode root = new TrieNode();

        int count = 0;

        int n = s.length();

        // Har suffix insert karo
        for (int i = 0; i < n; i++) {

            TrieNode curr = root;

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'a';

                // New node => New distinct substring
                if (curr.child[index] == null) {
                    curr.child[index] = new TrieNode();
                    count++;
                }

                curr = curr.child[index];
            }
        }

        return count;
    }
}