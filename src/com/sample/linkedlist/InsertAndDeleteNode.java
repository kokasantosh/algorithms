package com.sample.linkedlist;

public class InsertAndDeleteNode {
    public static void main(String[] args) {
        LinkedListNode root = insert(null, "B", 0);
        insert(root, "D", 1);
        insert(root, "C", 1);
        root = insert(root,"A", 0);
        root.print();
        remove(root, 1);
        remove(root, 2);
        root = remove(root, 0);
        root.print();
    }
    private static LinkedListNode insert(LinkedListNode root, String value, int index){
        LinkedListNode nodeInserted = new LinkedListNode(value);
        if(root != null){
            if(index ==  0){
                nodeInserted.setNext(root);
            } else {
                LinkedListNode currNode = root;
                for (int i = 0; i < index - 1; i++) {
                    currNode = currNode.next();
                }
                nodeInserted.setNext(currNode.next());
                currNode.setNext(nodeInserted);
            }
        }
        return nodeInserted;
    }

    public static LinkedListNode remove(LinkedListNode root, int index) {
        LinkedListNode rootNode = root;
        if(root != null){
            int i = 0; LinkedListNode curr = root;
            if(index == 0) {
                rootNode = rootNode.next();
                root.setNext(null);
                return rootNode;
            }
            while(curr != null && i != index-1){
                curr = curr.next();
                i++;
            }
            if(curr != null && curr.next() != null) {
                curr.setNext(curr.next().next());
            }
        }
        return rootNode;
    }
}
