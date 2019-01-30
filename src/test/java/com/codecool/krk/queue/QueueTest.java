package com.codecool.krk.queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    void testEnqueOneItem(){
        Queue queue = new Queue();
        String expected = "0";
        queue.enqueue(expected);

        String actual = queue.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testEnqueMultipleItems(){
        Queue queue = new Queue();
        int howMany = 5;
        enqueueValues(queue, howMany);

        String expected = "0 1 2 3 4";
        String actual = queue.toString();

        assertEquals(expected, actual);
    }

    private void enqueueValues(Queue queue, int howMany) {
        for(int i =0; i < howMany; i++){
            queue.enqueue(String.valueOf(i));
        }
    }

}
