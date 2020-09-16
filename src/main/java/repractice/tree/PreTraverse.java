package repractice.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreTraverse {
    @Test
    public void pre() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> integers = preorderTraversal(root);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) return new ArrayList<Integer>();
        preTraversal(root, list);
        return list;
    }

    public void preTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preTraversal(node.left, list);
        preTraversal(node.right, list);
    }

    public void postTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postTraversal(node.left, list);
        postTraversal(node.right, list);
        list.add(node.val);
    }

    public void midTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        midTraversal(node.left, list);
        list.add(node.val);
        midTraversal(node.right, list);
    }

    public void depthFirstSearch(TreeNode nodeHead) {
        if (nodeHead == null) {
            return;
        }
        Stack<TreeNode> myStack = new Stack<>();
        myStack.add(nodeHead);
        while (!myStack.isEmpty()) {
            TreeNode node = myStack.pop();    //弹出栈顶元素
            if (node.right != null) {
                myStack.push(node.right);    //深度优先遍历，先遍历左边，后遍历右边,栈先进后出
            }
            if (node.left != null) {
                myStack.push(node.left);
            }
        }
    }
}
