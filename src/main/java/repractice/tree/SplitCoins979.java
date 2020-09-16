package repractice.tree;

import org.junit.Test;

public class SplitCoins979 {

    Integer[] array = {0,0,3};
    @Test
    public void main() {
        System.out.println(distributeCoins(ConstructTree.constructTree(array)));
    }

    public int distributeCoins(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    int ans = 0;

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans += Math.abs(left) + Math.abs(right);
        return root.val - 1 + left + right;
    }
}
