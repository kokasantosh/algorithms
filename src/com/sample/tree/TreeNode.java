package com.sample.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNode {
    private String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void printBFS() {
        Queue<TreeNode> queue = new LinkedBlockingQueue();
        queue.add(this);
        printBFS(queue);
    }

    private void printBFS(Queue<TreeNode> input) {
        Queue<TreeNode> queue = new LinkedBlockingQueue();
        for(TreeNode node : input) {
            System.out.println(node.value);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        if(! queue.isEmpty()) {
            printBFS(queue);
        }
    }

    public void printDFS() {
        if(this.left != null) {
            this.left.printDFS();
        }
        System.out.println(this.value);

        if(this.right != null) {
            this.right.printDFS();
        }
    }

    public static int getHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
