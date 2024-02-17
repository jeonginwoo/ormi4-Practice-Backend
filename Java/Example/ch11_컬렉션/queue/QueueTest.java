package ch11_컬렉션.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Member> queue = new LinkedList<>();
        queue.offer(new Member("홍길동"));
        queue.offer(new Member("고길동"));
        queue.offer(new Member("마이콜"));

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("--------------------");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
