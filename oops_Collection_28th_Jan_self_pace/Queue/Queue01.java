package oops_Collection_28th_Jan_self_pace.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(132);
        integerQueue.add(131);
        integerQueue.add(125);
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);


//        integerQueue.add("Pramod");
//        integerQueue.add("Akhil");
//        integerQueue.add("Alis");
//        System.out.println(integerQueue);

    }
}
