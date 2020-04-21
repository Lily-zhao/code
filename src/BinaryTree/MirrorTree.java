package BinaryTree;

public class MirrorTree {
    public TreeNode mirrorTreefc(TreeNode root){
        if(root == null) return null;
        mirrorTreefc(root.left);
        mirrorTreefc(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = root.left;
        return  root;
    }
}
