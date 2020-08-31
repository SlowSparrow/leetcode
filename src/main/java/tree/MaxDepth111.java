package tree;

import org.junit.Test;

public class MaxDepth111 {

    @Test
    public void main() {
        System.out.println(minDepth(TreeUtil.getExampleTree()));
    }

    int depth = 0;
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        minDepth2(root);
        return min;
    }

    public void minDepth2(TreeNode root) {
        if(root==null) return;

        depth++;
        minDepth2(root.left);
        minDepth2(root.right);
        if(root.left==null && root.right==null){
            if(depth < min) min = depth;
        }
        depth--;
    }
}
