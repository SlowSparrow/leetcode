package tree;

import org.junit.Test;

public class PathSumMax124 {
    int max = Integer.MIN_VALUE;
    @Test
    public void main() {
        System.out.println(maxPathSum(TreeUtil.getExampleTree2()));
    }

    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }

    public int maxSum(TreeNode node){
        if(node == null) return 0;
//       这样排除负数
        int left = Math.max(maxSum(node.left),0);
        int right = Math.max(maxSum(node.right),0);
        max = node.val + left + right;
        return node.val + Math.max(left,right);
    }
}
