package oops_Collection_3rd_Feb;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab195 {
    public static void main(String[] args) {

        Queue pq = new PriorityQueue();
        Queue<String> pq1 = new PriorityQueue();

        pq.offer(95);
        pq.offer(5);
        pq.offer(75);
        pq.offer(68);
        pq.poll();

        System.out.println(pq);

        pq1.add("Stobe");
        pq1.add("Alis");
        pq1.add("Bob");
        System.out.println(pq1);
    }
}
