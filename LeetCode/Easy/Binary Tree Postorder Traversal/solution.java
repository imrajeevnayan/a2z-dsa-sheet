class Solution {
    static void postorder(TreeNode root,List<Integer>res){
        if(root==null)return ;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
}