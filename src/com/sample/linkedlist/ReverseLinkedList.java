package com.sample.linkedlist;

import sun.awt.image.ImageWatched;

public class ReverseLinkedList {

    public static void main(String[] args){
        LinkedListNode<String> linkedListNode1 = new LinkedListNode("1");
        LinkedListNode<String> linkedListNode2 = new LinkedListNode("2");
        LinkedListNode<String> linkedListNode3 = new LinkedListNode("3");
        LinkedListNode<String> linkedListNode4 = new LinkedListNode("4");
        LinkedListNode<String> linkedListNode5 = new LinkedListNode("5");
        LinkedListNode<String> linkedListNode6 = new LinkedListNode("6");
        linkedListNode1.setNext(linkedListNode2);
        linkedListNode2.setNext(linkedListNode3);
        linkedListNode3.setNext(linkedListNode4);
        linkedListNode4.setNext(linkedListNode5);
        linkedListNode1.print();
        LinkedListNode reverse = reverseList(linkedListNode1);
        reverse.print();
    }

    public static LinkedListNode reverseList(LinkedListNode node) {
        LinkedListNode prev = null;
        LinkedListNode curr = node;
        while (curr != null){
            LinkedListNode temp = curr;
            curr = curr.next();
            temp.setNext(prev);
            prev = temp;
        }
        return prev;
    }
}
