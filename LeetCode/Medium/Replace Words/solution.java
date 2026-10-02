class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            String shortestRoot = word;

            for (String root : dictionary) {

                if (word.startsWith(root)) {

                    if (root.length() < shortestRoot.length()) {
                        shortestRoot = root;
                    }
                }
            }

            ans.append(shortestRoot).append(" ");
        }

        return ans.toString().trim();
    }
}
