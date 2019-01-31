package com.codecool.krk.queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {

    @Test
    void testEnqueOneItem() {
        Queue queue = new Queue();
        String expected = "0";
        queue.enqueue(expected);

        String actual = queue.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testEnqueMultipleItems() {
        Queue queue = new Queue();
        int howMany = 5;
        enqueueValues(queue, howMany);

        String expected = "0 1 2 3 4";
        String actual = queue.toString();

        assertEquals(expected, actual);
        assertEquals(howMany, queue.getSize());
    }

    private void enqueueValues(Queue queue, int howMany) {
        for (int i = 0; i < howMany; i++) {
            queue.enqueue(String.valueOf(i));
        }
    }

    @Test
    void testDequeueOnMultipleItems() {
        Queue queue = new Queue();
        int howMany = 5;
        enqueueValues(queue, howMany);

        String expectedItem = "0";
        String actualItem = queue.dequeue();
        String expectedQueue = "1 2 3 4";
        String actualQueue = queue.toString();

        assertEquals(expectedItem, actualItem);
        assertEquals(expectedQueue, actualQueue);
    }

    @Test
    void testEnqueueAfterDequeueOnMultipleItems() {
        Queue queue = new Queue();
        int howMany = 5;
        enqueueValues(queue, howMany);
        queue.dequeue();

        queue.enqueue("5");
        String expectedQueue = "1 2 3 4 5";
        String actualQueue = queue.toString();

        assertEquals(expectedQueue, actualQueue);
    }

    @Test
    void testDequeueOnLastItem(){
        Queue queue = new Queue();
        int howMany = 1;
        enqueueValues(queue, howMany);

        String expectedItem = "0";
        String actualItem = queue.dequeue();
        String expectedQueue = "";
        String actualQueue = queue.toString();

        assertEquals(expectedItem, actualItem);
        assertEquals(expectedQueue, actualQueue);
    }

    @Test
    void testEnqueueAfterDequeueOnLastItem() {
        Queue queue = new Queue();
        int howMany = 1;
        enqueueValues(queue, howMany);
        queue.dequeue();

        queue.enqueue("666");
        String expectedQueue = "666";
        String actualQueue = queue.toString();

        assertEquals(expectedQueue, actualQueue);
    }

    @Test
    void testDequeueOnEmptyThrowsException(){
        Queue queue = new Queue();

        assertThrows(QueueUnderflow.class, ()-> queue.dequeue());
    }

}
