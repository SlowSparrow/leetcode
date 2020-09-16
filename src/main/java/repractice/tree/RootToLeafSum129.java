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

    public int dfs2(TreeNode root, int i) {
        if (root == null) return 0;//1、节点为空
        int res = i * 10 + root.val;
        if (root.left == null && root.right == null)//2、节点为叶子节点
            return res;
        return dfs2(root.left, res) + dfs2(root.right, res);//3、节点为非叶子节点
    }

    public int dfs(TreeNode root, int i) {
        if (root == null) return 0;
        int sum = root.val + i* 10 ;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
