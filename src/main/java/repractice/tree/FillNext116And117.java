package repractice.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FillNext116And117 {

    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        PreTraverse preTraverse = new PreTraverse();
        List<Integer> list = new ArrayList<>();
        TreeNode connect = connect(ConstructTree.constructTree(arrayTree));
        ConstructTree.preTraverse(connect);
    }

    public TreeNode connect(TreeNode root) {
        if(root == null) return null;
        Deque<TreeNode> deque = new LinkedList<>();
        Deque<TreeNode> preque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            while (!deque.isEmpty()) {
                TreeNode poll = deque.poll();
                if (poll.left != null) preque.add(poll.left);
                if (poll.right != null) preque.add(poll.right);
            }

            while(!preque.isEmpty()){
                TreeNode node = preque.poll();
                node.next = preque.peek();
                deque.add(node);
            }
        }
        return root;
    }

}
