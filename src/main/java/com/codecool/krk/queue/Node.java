package com.codecool.krk.queue;

public class Node {
    private Node next;
    private String content;
    private int priority;

    public Node(String content) {
        this.content = content;
        this.priority = 0;
    }

    public Node(String content, int priority) {
        this.content = content;
        this.priority = priority;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getContent() {
        return content;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
