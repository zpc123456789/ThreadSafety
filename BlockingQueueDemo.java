package com.atguigu.demo3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

//阻塞队列，复杂的的过程不用再写，由阻塞队列完成
//不足要关心什么时候需要阻塞线程，什么时候需要唤醒线程，一切都由blockingqueue包办
//在concurrent包办发布以前，再多线程环境下，我们都必须自己控制这些细节，尤其还要兼顾线程的效率和安全，会给我们的程序带来 不小的复杂度
public class BlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
		System.out.println(blockingQueue.offer(1, 5, TimeUnit.SECONDS));
		System.out.println(blockingQueue.offer(2, 5, TimeUnit.SECONDS));
		System.out.println(blockingQueue.offer(3, 5, TimeUnit.SECONDS));
		System.out.println(blockingQueue.offer(8, 5, TimeUnit.SECONDS));
		
		System.out.println(blockingQueue.poll(1, TimeUnit.SECONDS));
		System.out.println(blockingQueue.poll(1, TimeUnit.SECONDS));
		System.out.println(blockingQueue.poll(1, TimeUnit.SECONDS));
		System.out.println(blockingQueue.poll(1, TimeUnit.SECONDS));
		//System.out.println(blockingQueue.poll(2, TimeUnit.SECONDS));
		 
		
//		blockingQueue.offer(1);
//		System.out.println(blockingQueue.offer(1));
//		blockingQueue.offer(1);
//		 
//		System.out.println(blockingQueue.offer(1));
//		
//		System.out.println(blockingQueue.poll());
//		System.out.println(blockingQueue.poll());
//		System.out.println(blockingQueue.poll());
//		System.out.println(blockingQueue.poll());
		
//		blockingQueue.put(1);
//		blockingQueue.put(1);
//		blockingQueue.put(1);
//		//blockingQueue.put(1);
//		System.out.println(blockingQueue.take());
//		System.out.println(blockingQueue.take());
//		System.out.println(blockingQueue.take());
//		System.out.println(blockingQueue.take());
	    
//		blockingQueue.offer(2);
//		blockingQueue.offer(3);
//		blockingQueue.offer(4);
//		System.out.println(blockingQueue.offer(1));
		
//		blockingQueue.poll();
//		blockingQueue.poll();
//		blockingQueue.poll();
//		blockingQueue.poll();
		
		
//		Integer peek = blockingQueue.peek();
		//System.out.println(peek);
		
		
		
//		blockingQueue.add(1);
//		blockingQueue.add(2);
//		blockingQueue.add(3);
//		System.out.println(blockingQueue.add(4));
		//java.lang.IllegalStateException
		
		
//		blockingQueue.remove();
//		blockingQueue.remove();
//		blockingQueue.remove();
		//blockingQueue.remove();
		// java.util.NoSuchElementException
		//Integer element = blockingQueue.element();
		//System.out.println(element);
				
	}

}










































