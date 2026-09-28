class Solution {
    public int maxDepth(String s) {
        int depth=0,maxDepth=0;
        for(char ch: s.toCharArray()){
             if(ch=='('){
                depth++;
                maxDepth=Math.max(maxDepth,depth);
             }
             else if(ch==')') depth--;
        }
        return maxDepth;
    }
}