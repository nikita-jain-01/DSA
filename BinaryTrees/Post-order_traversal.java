class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder=new LinkedList<>();
        if(root==null)
            return postorder;
        makepostorder(root,postorder);
        return postorder;
    }
    
    public void makepostorder(TreeNode root,List<Integer> postorder){
        if(root==null)
            return ;
        makepostorder(root.left,postorder);
        makepostorder(root.right,postorder);
        postorder.add(root.val);
    }
}