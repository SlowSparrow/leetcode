package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeHeightCount {
    Integer[] arrayTree = {4,9,0,5,1};

    @Test
    public void main() {
        TreeNode root = ConstructTree.constructTree(arrayTree);
        System.out.println("height"+countHeight(root));
        ConstructTree.preTraverse(root);
    }

    @Test
    public void main2() {
        TreeNode root = ConstructTree.constructTree(arrayTree);
        System.out.println("nodes" + countNodes(root));
        ConstructTree.preTraverse(root);
    }

    public int countHeight(TreeNode root){
        if(root == null) return 0;

        int left = countHeight(root.left);
        int right = countHeight(root.right);

        return Math.max(left,right) + 1;

    }

    public int countNodes(TreeNode root){
        if(root == null) return 0;

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }
}
