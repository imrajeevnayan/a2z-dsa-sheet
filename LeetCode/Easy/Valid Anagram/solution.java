class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int freq[]=new int[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        for(char c:t.toCharArray())freq[c-'a']--;
        for(int f:freq){
            if(f!=0)return false;
        }
        return true;
    }
}