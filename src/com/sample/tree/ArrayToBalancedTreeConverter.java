package com.sample.tree;

public class ArrayToBalancedTreeConverter {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        TreeNode root = convertToBalacedTree(arr, 0, arr.length -1);
        root.printBFS();
        root.printDFS();
    }

    private static TreeNode convertToBalacedTree(int[] arr, int start , int end) {
        if(arr.length == 0 || start>end) {
            return null;
        }
        int middleIndex = (start+end)/2;
        TreeNode node = new TreeNode(arr[middleIndex]);
        node.setLeft(convertToBalacedTree(arr, start, middleIndex -1));
        node.setRight(convertToBalacedTree(arr, middleIndex + 1, end));
        return node;
    }

}
