class Solution {
    int rightLeafSum(Node root) {
       if(root==null) return 0;
       int sum=0;
       if(root.right!=null  && root.right.left==null && root.right.right ==null){
           sum+=root.right.data;
       }
       return sum + rightLeafSum(root.left)+ rightLeafSum(root.right);
    }
}