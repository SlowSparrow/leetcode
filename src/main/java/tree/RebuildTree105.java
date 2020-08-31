package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RebuildTree105 {
    @Test
    public void main() {
        int[] pre = {1,2};
        int[] inorder = {2,1};
        TreeNode node = buildTree(pre, inorder);
        ConstructTree.preTraverse(node);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if(preEnd < preStart) return null;
        if(preEnd-preStart == 0){
            return new TreeNode(preorder[preStart]);
        }

        int temp = preorder[preStart];
        TreeNode root = new TreeNode(preorder[preStart]);
        int i = 0;
        for (i = inStart; i <= inEnd; i++) {
            if(temp == inorder[i]) break;
        }
        int length = i - inStart;

        root.left = buildTree(preorder,preStart +1 ,preStart+length,inorder,inStart,i-1);
        root.right = buildTree(preorder,preStart+length+1,preEnd,inorder, i+1 ,preEnd);

        return root;
    }
}
