package org.collections.QueueAndDequeue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> que = new ArrayBlockingQueue<>(8);
		try {
			que.add(1);
			que.add(2);
			que.add(3);
			que.add(4);
			que.add(5);
			que.add(6);
			que.add(7);
			que.add(8);
		} catch (Exception e) {
			System.out.println("Queue is full");
		}

		System.out.println("First set of Queue:- ");

		for (Integer tmp : que) {
			System.out.println(tmp);
		}

		/*
		 * Queue<Integer> que2 = new ArrayBlockingQueue<>(6);
		 * 
		 * 
		 * try { que2.add(1); que2.add(2); que2.add(3); que2.add(4); que2.add(5);
		 * que2.add(6); que2.add(7); que2.add(8); } catch (Exception e) {
		 * System.out.println("Queue is full"); }
		 */

		System.out.println("After modifying the Queue:- ");
		que.remove();
		for (Integer tmp : que) {
			System.out.println(tmp);
		}

		System.out.println("First element After modifying the Queue is:- " + que.element());

	}
}