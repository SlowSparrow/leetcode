package repractice.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BuildTreeFromPreTraverse1028 {


    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        PreTraverse preTraverse = new PreTraverse();
        List<Integer> list = new ArrayList<>();
//        TreeNode connect = recoverFromPreorder(ConstructTree.constructTree(arrayTree));
        String str = "1-2--3---4-5--6---7";
        TreeNode node = recoverFromPreorder(str);
        ConstructTree.preTraverse(node);
    }

    public TreeNode recoverFromPreorder(String S) {
        return recover(S, 0, S.length());
    }

    int index = 0;
    int depth = 0;
    public TreeNode recover(String S, int start, int end) {
        int value = getValue(S);
        if(value == -1) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(new TreeNode(value));
        while(index<S.length()){
            int tempValue = getValue(S);
            if(stack.size() == depth){
                TreeNode peek = stack.peek();
                peek.left = new TreeNode(tempValue);
                stack.push(peek.left);
            }else{
                while(stack.size()>depth){
                    stack.pop();
                }
                TreeNode peek = stack.peek();
                peek.right = new TreeNode(tempValue);
                stack.push(peek.right);
            }
        }

        while(stack.size() > 1){
            stack.pop();
       }
        return stack.pop();
    }

    private int getValue(String s) {
        boolean meetDigit = false;
        int value = 0;
        depth = 0;
        for (; index < s.length(); index++) {
            if(s.charAt(index)!='-'){
                meetDigit = true;
                value = value*10 + (s.charAt(index) - '0');
            }else if(s.charAt(index)=='-' && !meetDigit){
                depth++;
                continue;
            }else{
                break;
            }
        }

        return value;
    }
}
