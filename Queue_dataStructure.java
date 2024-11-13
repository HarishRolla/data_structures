

// Queue = FIFO - First in first out
// a collections designed for holding elements prior to processing
// its a leaner data structures
// add = enqueue, offer()
//remove = dequeue , poll()

// functions inherient from collections (isEmpty, size, contains)

import java.util.LinkedList;
import java.util.Queue;

public class Queue_dataStructure {
    public static void main(String[] args){
        // we cannot initiate type Queue because its a interface , so we initiate it with type linkedlist
        // by structure of collections in java queue is implemented by 2 classes linkedlist and priorityqueues
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("harish");
        queue.offer("pavan");
        queue.offer("rolla");
        System.out.println( queue);
        System.out.println( queue.isEmpty());

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        System.out.println(queue.contains("harish"));
        System.out.println(queue.size());

        // queue used in
        // 1. Keyboard buffer
        // 2. Printer Queue
        // 3. Us3ed in linked lists , priority queues, Breath first search

    }








}
