package org.oop.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println("queue 크기: " + queue.size());

		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println("queue 크기: " + queue.size());
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println("queue 크기: " + queue.size());
		
		System.out.println(queue.poll());
	}

}
