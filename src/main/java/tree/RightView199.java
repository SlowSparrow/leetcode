package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightView199 {

    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        PreTraverse preTraverse = new PreTraverse();
        List<Integer> list = new ArrayList<>();
        List<Integer> integers = rightSideView(ConstructTree.constructTree(arrayTree));
        integers.forEach(System.out::println);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Deque<TreeNode> deque = new LinkedList<>();
        Deque<TreeNode> preque = new LinkedList<>();
        deque.add(root);
        result.add(root.val);
        while (!deque.isEmpty()) {
            while (!deque.isEmpty()) {
                TreeNode poll = deque.poll();
                if (poll.left != null) preque.add(poll.left);
                if (poll.right != null) preque.add(poll.right);
            }

            while(!preque.isEmpty()){
                if(preque.size()==1){
                    result.add(preque.peek().val);
                }
                deque.add(preque.poll());
            }
        }
        return result;
    }
}
