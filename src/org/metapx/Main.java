package org.metapx;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);

        BTCodec codec = new BTCodec();
        String data = codec.serialize(root);
        System.out.println(data);

        TreeNode deserialized = codec.deserialize(data);
        System.out.println(deserialized.val);
        System.out.println(deserialized.left.val);
        System.out.println(deserialized.right.val);
        System.out.println(deserialized.right.right.val);
        System.out.println(deserialized.left.left.val);
        System.out.println(deserialized.left.right.val);
    }
}