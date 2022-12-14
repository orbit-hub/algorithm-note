package com.orbit.code.tree.lc01;

import com.orbit.code.tree.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }
}
