package tree;

import org.junit.Test;

public class TreeToLinkedList114 {

    Integer[] array = {1,2,5,3,4,null,6};
    @Test
    public void main() {
        TreeNode exampleTree = ConstructTree.constructTree(array);
        flatten(exampleTree);
        ConstructTree.preTraverse(exampleTree);
    }

    private TreeNode pre = null;

    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);

        root.right = pre;
        root.left = null;
        pre = root;

    }
}
