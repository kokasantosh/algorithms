package com.sample.tree;

public class TreeHeightFinder {
    public static int height = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.setValue("1");
        TreeNode left = new TreeNode();
        left.setValue("2");
        TreeNode right = new TreeNode();
        right.setValue("3");
        root.setLeft(left);
        root.setRight(right);

        TreeNode leftLeft = new TreeNode();
        leftLeft.setValue("4");
        TreeNode leftRight = new TreeNode();
        leftRight.setValue("5");
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        TreeNode rightLeft = new TreeNode();
        rightLeft.setValue("6");
        TreeNode rightRight = new TreeNode();
        rightRight.setValue("7");
        right.setLeft(rightLeft);
        right.setRight(rightRight);
        getHeight(root, 1);
        System.out.println("Height of the tree is: " + height);

        System.out.println("Height of the tree is: " + TreeNode.getHeight(root));
    }

    public static void getHeight(TreeNode node, int level) {
        height = Math.max(height, level);
        if(node.getLeft() != null) {
            getHeight(node.getLeft(), level + 1);
        }
        if(node.getRight() != null) {
            getHeight(node.getRight(), level + 1);
        }
    }
}
