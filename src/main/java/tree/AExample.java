package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AExample {
    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        TreeNode root = ConstructTree.constructTree(arrayTree);
        ConstructTree.preTraverse(root);
    }


}
