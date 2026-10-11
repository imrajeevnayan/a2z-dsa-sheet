class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Hamesha chote sentence ko 'words1' maano taaki logic simple rahe
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        if (words1.length > words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }
        
        int n = words1.length;
        int m = words2.length;
        
        // Left pointer: Prefix match count karo
        int left = 0;
        while (left < n && words1[left].equals(words2[left])) {
            left++;
        }
        
        // Agar poora chota sentence prefix se match ho gaya
        if (left == n) return true;
        
        // Right pointer: Suffix match count karo
        int right1 = n - 1;
        int right2 = m - 1;
        while (right1 >= left && words1[right1].equals(words2[right2])) {
            right1--;
            right2--;
        }
        
        // Agar saare remaining words of smaller sentence suffix se match ho gaye
        // Matlab middle part skip ho sakta hai
        return right1 < left;
    }
}