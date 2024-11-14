// Priority Queues = FIFO data structure that serves elements with the highest priorities first before elements with lower priority

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queues {
    public static void main(String args[]){

        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
        queue.offer(3.3);
        queue.offer(4.5);
        queue.offer(1.2);
        queue.offer(5.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
