package tree;

import java.util.List;

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
}
