package com.atguigu.demo3;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//semaphore 信号
public class SemaphoreDemo {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);

		for (int i = 1; i <= 6; i++) {
			new Thread(() -> {
				boolean flag = false;
				try {
					semaphore.acquire();
					flag = true;
					System.out.println(Thread.currentThread().getName() + " 抢到了车位 ");
					TimeUnit.SECONDS.sleep(new Random().nextInt(4));
					System.out.println(Thread.currentThread().getName() + " -------离开了车位 ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (flag==true) {
						semaphore.release();
					}	
				}

			}, String.valueOf(i)).start();

		}
	}

}
