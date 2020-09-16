package repractice.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseTree226 {
    @Test
    public void main() {
        System.out.println(invertTree(TreeUtil.getExampleTree()));
        PreTraverse preTraverse = new PreTraverse();
        List<Integer> list = new ArrayList<>();
        preTraverse.preTraversal(invertTree(TreeUtil.getExampleTree()),list);
        list.forEach(System.out::println);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
