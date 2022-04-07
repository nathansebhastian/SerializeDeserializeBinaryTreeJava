package org.metapx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BTCodec {
    // Encodes a tree to a single string.
    String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        return "" + root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }
        List<String> values = new ArrayList<>(Arrays.asList(data.split(",")));

        return deserial(values);
    }

    private TreeNode deserial(List<String> values) {
        String val = values.remove(0);
        if (val.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserial(values);
        root.right = deserial(values);
        return root;
    }
}