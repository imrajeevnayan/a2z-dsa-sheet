import java.util.*;

class Solution {

    List<Integer>[] tree;
    List<Integer>[] newTree;
    int[] newParent;
    String s;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        this.s = s;

        tree = new ArrayList[n];
        newTree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
            newTree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        newParent = parent.clone();

        int[] last = new int[26];
        Arrays.fill(last, -1);

        buildNewParents(0, last, parent);

        for (int i = 1; i < n; i++) {
            newTree[newParent[i]].add(i);
        }

        int[] ans = new int[n];
        dfsSize(0, ans);

        return ans;
    }

    private void buildNewParents(int u, int[] last, int[] parent) {
        int c = s.charAt(u) - 'a';

        int prev = last[c];
        last[c] = u;

        for (int v : tree[u]) {
            int ch = s.charAt(v) - 'a';

            if (last[ch] != -1) {
                newParent[v] = last[ch];
            } else {
                newParent[v] = parent[v];
            }

            buildNewParents(v, last, parent);
        }

        last[c] = prev;
    }

    private int dfsSize(int u, int[] ans) {
        int size = 1;

        for (int v : newTree[u]) {
            size += dfsSize(v, ans);
        }

        ans[u] = size;
        return size;
    }
}