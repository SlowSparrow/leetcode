package tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FakeCycleStr1457 {


    Integer[] arrayTree = {2, 3, 1, 3, 1, null, 1};

    @Test
    public void main() {
        System.out.println(pseudoPalindromicPaths(ConstructTree.constructTree(arrayTree)));
    }

    int count = 0;
    Stack<TreeNode> treeNodes = new Stack<>();

    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) return 0;
        travelser(root);
        return count;
    }

    public void travelser(TreeNode root) {
        if (root == null) return;

        treeNodes.push(root);

        travelser(root.left);

        travelser(root.right);
        TreeNode pop = treeNodes.pop();
        if (root.left == null && root.right == null) {
            int[] array = new int[10];
            array[pop.val]++;

            for (TreeNode treeNode : treeNodes) {
                array[treeNode.val]++;
            }

            int sum = 0;
            int single = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                if (array[i] % 2 == 1) {
                    single++;
                }
            }

            if (single == 1 && sum % 2 == 1) {
                count++;
            }

            if (single == 0) {
                count++;
            }
        }
    }
}