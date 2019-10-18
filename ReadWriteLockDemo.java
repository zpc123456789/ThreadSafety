package com.atguigu.demo3;

public class ReadWriteLockDemo {
	public static void main(String[] args) {
		MyCache myCache  = new MyCache();
		
		for (int i = 1; i <=20; i++) {
			int finalI = i;
			new Thread(()->{
				myCache.write(finalI+"", finalI+"");
			},String.valueOf(i)).start();
		}
		
		for (int i = 1; i <=20; i++) {
			int finalI = i;
			new Thread(()->{
				myCache.read(finalI+"");
			},String.valueOf(i)).start();
		}
		
	}
	
	
	
	

}


































