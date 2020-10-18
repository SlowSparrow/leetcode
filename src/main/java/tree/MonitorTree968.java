package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MonitorTree968 {
    Integer[] arrayTree = {0,0,null,0,null,0,null,null,0};
/*    有三个状态:
            0=>这个结点待覆盖
1=>这个结点已经覆盖
2=>这个结点上安装了相机*/
    @Test
    public void main() {
        TreeNode root = ConstructTree.constructTree(arrayTree);
        int i = minCameraCover(root);
        System.out.println(res);
    }


    public int minCameraCover(TreeNode root) {
        if (lrd(root) == 0) {
            res++;
        }
        return res;
    }

    int res=0;
    int lrd(TreeNode node) {

        if (node == null) {
            return 1;
        }
        int left=lrd(node.left);
        int right=lrd(node.right);
        if (left == 0 || right == 0) {
            res++;
            return 2;
        }
        if(left==1&&right==1){
            return 0;
        }

            return 1;
    }

}
