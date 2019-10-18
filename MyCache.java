package com.atguigu.demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class MyCache {
	private volatile Map<String, String> map = new HashMap<String, String>();
	
	private ReentrantReadWriteLock  readWriteLock = new ReentrantReadWriteLock();
	
	public void write(String key, String value) {
		readWriteLock.writeLock().lock();
		
		String name = Thread.currentThread().getName();
		System.out.println(name+"\t"+"写开始");
		map.put(key, value);
		System.out.println(name+"\t"+"写结束");
		
		readWriteLock.writeLock().unlock();
	}
	
	public void read(String key) {
		 
		readWriteLock.readLock().lock();
		String name = Thread.currentThread().getName();
		System.out.println(name+"\t"+"读开始");
		String result = map.get(key);
		System.out.println(name+"\t"+"读结束 result: "+result);
		readWriteLock.readLock().unlock();
		
		 
	}
	
	
	
/*	private Lock lock = new ReentrantLock();
	
	
 
    public void write(String key ,String value)
    {
        lock.lock();
        try
        {
            System.out.println(Thread.currentThread().getName()+"\t 写入开始");
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"\t 写入结束");
        }finally {
            lock.unlock();
        }

    }
    public void read(String key)
    {
        lock.lock();
        try
        {
            String result = null;
            System.out.println(Thread.currentThread().getName()+"\t 读取开始");
            result = map.get(key);
            System.out.println(Thread.currentThread().getName()+"\t 读取结束result： "+result);
        }finally {
            lock.unlock();
        }
    }*/
	
	/*
	//写操作
	public void write(String key,String value) {
		lock.lock();
		
		String name = Thread.currentThread().getName();
		System.out.println(name+"\t"+"写开始");
		map.put(key, value);
		System.out.println(name+"\t"+"写结束");
		
		lock.unlock();
	}
	
	//读操作
	public void read(String key,String value) {
		 
		lock.lock();
		String name = Thread.currentThread().getName();
		System.out.println(name+"\t"+"读开始");
		String result = map.get(key);
		System.out.println(name+"\t"+"读结束 result: "+result);
		
		lock.unlock();
	}*/
	
	
}





































