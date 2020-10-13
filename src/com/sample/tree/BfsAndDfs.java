package com.sample.tree;

public class BfsAndDfs {

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

        System.out.println("BFS: ");
        root.printBFS();
        System.out.println("DFS: ");
        root.printDFS();
    }

}
