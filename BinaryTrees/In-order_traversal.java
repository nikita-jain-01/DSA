class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new LinkedList<>();
        if(root==null)
            return inorder;
        else
            makeinorder(root,inorder);
        return inorder;
    }
    
    public void makeinorder(TreeNode root,List<Integer> inorder){
        if(root==null)
            return;
        makeinorder(root.left,inorder);
        inorder.add(root.val);
        makeinorder(root.right,inorder);
    }
}