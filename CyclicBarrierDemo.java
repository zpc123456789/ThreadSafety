package com.atguigu.demo3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier c = new CyclicBarrier(7,()-> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("集齐了七龙珠召唤神龙");
		});
				
		for (int i = 1; i <=7; i++) {
			int finalI = i;
			new Thread(()->{
				try {
					System.out.println(Thread.currentThread().getName()+"  收集到了第几颗： "+finalI);
					//c.await();
					c.await(3, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TimeoutException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			},String.valueOf(i)).start();
		}
	}

}
