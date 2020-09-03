package tree;

public class CutTree814 {

    public TreeNode pruneTree(TreeNode root) {
        int cut = cut(root);
        if(cut==1)
            return root;
        else
            return null;
    }

    public int cut(TreeNode node){
        if(node == null) return 0;

        int L = cut(node.left);
        int R = cut(node.right);

        if(L==0) node.left = null;
        if(R==0) node.right = null;

        return L + R + node.val > 0 ? 1 : 0;

    }
}
