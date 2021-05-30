package com.sample.linkedlist;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.print();
        list.removeAtIndex(0);
        list.removeAtIndex(3);
        list.print();
        list.insertAtIndex(0, 5);
        list.insertAtIndex(4, 1);
        list.print();
        list.pop();
        list.print();
        list.insertAtIndex(0, 5);
        list.reverse();
        list.print();
        System.out.println("Middle element is: " + list.getMiddleElementVal().value);
        list.push(6);
        System.out.println("Middle element is: " + list.getMiddleElementVal().value);

        LinkedList list1 = new LinkedList();
        System.out.println("Middle element is: " + list1.getMiddleElementVal());
        list1.push(1);
        System.out.println("Middle element is: " + list1.getMiddleElementVal().value);

        System.out.println("Loop exists: " + list.isLoopExists());
        System.out.println("Loop1 exists: " + list1.isLoopExists());
    }

}
