package repractice.tree;

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
        if(node==null) return 0;

        int leftSum = Integer.max(maxSum(node.left),0);
        int rightSum = Integer.max(maxSum(node.right),0);

        int path = (leftSum + rightSum + node.val);
        max = Integer.max(max,path);
        return node.val + Math.max(leftSum,rightSum);
    }
}
