package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeafDistance1530 {

    @Test
    public void main() {
    }

/*
*   think：
*   需要什么就去创造什么
* */

    int count = 0;
    public int countPairs(TreeNode root, int distance) {
        caculate(root,distance);
        return count;
    }

    private int[] caculate(TreeNode root, int distance) {
        if(root == null) return new int[distance+1];

        if(root.left == null && root.right == null){
            int[] ints = new int[distance + 1];
            ints[0] = 1;
            return ints;
        }

        int[] depth = getArray(distance);
        int[] caculateL = caculate(root.left,distance);
        int[] caculateR = caculate(root.right,distance);

        for(int i = 0;i<distance;i++){
            depth[i+1] += caculateL[i];
            depth[i+1] += caculateR[i];
        }

        for (int i = 0; i <= distance; i++) {
            for (int j = 0; j + i + 2 <= distance ; j++) {
                count += caculateL[i] * caculateR[j];
            }
        }
        return depth;

    }

    private int[] getArray(int distance) {
        return new int[distance + 1];
    }
}
