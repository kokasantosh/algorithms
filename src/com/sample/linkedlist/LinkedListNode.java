package com.sample.linkedlist;

public class LinkedListNode<T> {
    private T value;
    private LinkedListNode<T> next;

    public LinkedListNode(T value) {
        this.value = value;
        next = null;
    }

    public LinkedListNode<T> next() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public T value() {
        return value;
    }

    public void print() {
        LinkedListNode node = this;
        while(node != null){
            System.out.println(node.value());
            node = node.next();
        }

    }
}
