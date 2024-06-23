package Dsa.DynamicQueue;

import java.sql.SQLOutput;

public class UseQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println("Size of queue :"+q.size());
        System.out.println(q.isEmpty());
        q.enqueue(10);
        System.out.println("Size of queue :"+q.size());
        System.out.println(q.isEmpty());
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Peeked elemnt:"+q.peek());
        System.out.println("Dequeue elemnt:"+q.dequeue());
        System.out.println("Size of queue :"+q.size());
        System.out.println(q.isEmpty());
    }
}
