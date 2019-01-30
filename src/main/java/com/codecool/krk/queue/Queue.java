package com.codecool.krk.queue;

public class Queue {
    private Node first;
    private Node last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (this.last == null) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.size++;
    }

    public String peek(){
        return this.last.getContent();
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = this.first;
        while (node != null) {
            builder.append(node.getContent());
            builder.append(' ');
            node = node.getNext();
        }
        return builder.toString().trim();
    }
}
