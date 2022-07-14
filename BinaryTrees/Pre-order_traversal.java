class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new LinkedList<>();
        if(root==null)
            return preorder;
        makepreorder(root,preorder);
        return preorder;
    }
    
    public void makepreorder(TreeNode root,List<Integer> preorder){
        if(root==null)
            return ;
        preorder.add(root.val);
        makepreorder(root.left,preorder);
        makepreorder(root.right,preorder);
    }
}