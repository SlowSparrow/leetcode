package repractice.tree;

import org.junit.Test;

public class RootToLeafSum129 {

    @Test
    public void main() {
        System.out.println(sumNumbers(TreeUtil.getExampleTree()));
    }

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }


    public int dfs(TreeNode root, int i) {
        if(root == null) return 0;
        int value = 10*i + root.val;
//        到叶子结点结算一次
        if(root.left == null && root.right == null){
            return value;
        }
        return dfs(root.left,value) + dfs(root.right,value);

    }
}
