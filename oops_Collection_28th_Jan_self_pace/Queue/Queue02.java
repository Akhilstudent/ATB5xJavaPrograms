package oops_Collection_28th_Jan_self_pace.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {

        ATBStudent s1 = new ATBStudent(105, "Pramod", "Java");
        ATBStudent s2 = new ATBStudent(102, "Akhil", "SeleniumJava");
        ATBStudent s3 = new ATBStudent(106, "Lucky", "Core");

        PriorityQueue<ATBStudent> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(s1);
        priorityQueue.add(s2);
        priorityQueue.add(s3);

        System.out.println(priorityQueue);
    }
}
