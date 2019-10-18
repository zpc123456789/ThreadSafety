package com.atguigu.demo3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch cdl = new CountDownLatch(7);
		for (int i = 1; i <=7; i++) {
			new Thread(()->{
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"\t 离开教室");
				
				cdl.countDown();
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			},String.valueOf(i)).start();
		}
		cdl.await(); //一直等下去，直到人走完
		//cdl.await(2, TimeUnit.SECONDS);  过时不候
		System.out.println(Thread.currentThread().getName()+"\t 锁门");
		
		
	}

}
