package tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtil {

    /*
    * 1
    * 2 3
    * */
    public static TreeNode getExampleTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        return root;
    }

    /*
     * 1
     * 2
     * */
    public static TreeNode getExampleTree2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        return root;
    }

/*    public static TreeNode createTree(int[] array){
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(new TreeNode(array[0]));

        for (int i = 1; i < array.length; i++) {
            TreeNode poll = nodeQueue.poll();
            poll.left = new TreeNode(array[i++]);
            poll.right = new TreeNode(array[i++]);
            nodeQueue.add(poll.left);
            nodeQueue.add(poll.right);
        }

    }*/
}
