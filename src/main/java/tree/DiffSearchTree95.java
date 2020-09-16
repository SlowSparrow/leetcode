package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DiffSearchTree95 {

    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        System.out.println(generateTrees(3));
    }

    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<>();
        List<TreeNode> trees = getTrees(1, n);
        return trees;
    }

    //    获取N种Tree的类型
    public List<TreeNode> getTrees(int start, int end) {
        List<TreeNode> ans = new ArrayList<>();
        if (start > end){
            ans.add(null);
            return ans;
        }
        if (start == end) {
            ans.add(new TreeNode(start));
            return ans;
        }

        for (int i = start; i <= end; i++) {

            List<TreeNode> left = getTrees(start, i - 1);
            List<TreeNode> right = getTrees(i + 1, end);

            for (TreeNode nodeLeft : left) {
                for (TreeNode nodeRight : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = nodeLeft;
                    root.right = nodeRight;
                    ans.add(root);
                }
            }

        }
        return ans;
    }
}
