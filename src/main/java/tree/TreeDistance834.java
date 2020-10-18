package tree;

import org.junit.Test;

import java.util.*;

public class TreeDistance834 {
    Integer[] arrayTree = {1, 2, 3, null, 5, null, 4};

    @Test
    public void main() {
        TreeNode root = ConstructTree.constructTree(arrayTree);
        ConstructTree.preTraverse(root);
    }

    List<Set<Integer>> graph = new ArrayList<>();
    int[] ans, count;
    int N;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        this.N = N;
        graph = new ArrayList<Set<Integer>>();
        ans = new int[N];
        count = new int[N];
        Arrays.fill(count, 1);

        for (int i = 0; i < N; ++i)
            graph.add(new HashSet<Integer>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(0, -1);
        dfs(0, -1);
        return ans;
    }

    public void dfs(int node, int parent) {
        for (int child : graph.get(node))
            if (child != parent) {
                dfs(child, node);
                count[node] += count[child];
                ans[node] += ans[child] + count[child];
            }
    }
}
