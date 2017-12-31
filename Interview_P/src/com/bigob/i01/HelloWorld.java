package com.bigob.i01;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Delayed;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.LockSupport;
/*
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;*/
import java.util.concurrent.locks.StampedLock;

public class HelloWorld {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		//CountDownLatch latch=new CountDownLatch(3);
		ThreadLocal<String> threadLocal=new ThreadLocal<>();
		//CyclicBarrier cyclicBarrier=new CyclicBarrier(1);
		ExecutorService service=null;
		Executors executors=null;
		ThreadPoolExecutor poolExecutor=null;
		ThreadFactory factory=null;
		Phaser phaser=null;
		PriorityBlockingQueue<String> blockingQueue=null;
		Deque<String> deque=null;
		LinkedBlockingQueue<String> linkedBlockingQueue=null;
		Delayed delayed=null;
		CopyOnWriteArrayList<String> copyOnWriteArrayList=null;
		CopyOnWriteArraySet<String> copyOnWriteArraySet=null;
		Exchanger<String> exchanger=null;
		CancellationException cancellationException=null;
		ArrayBlockingQueue<String> arrayBlockingQueue=null;
		//ConcurrentHashMap<String, String> concurrentHashMap=null;
		//Lock lock=null;
		//Condition condition=null;
		StampedLock stampedLock=null;
		//ReentrantLock reentrantLock=null;
		//ReadWriteLock readWriteLock=null;
		//ReentrantReadWriteLock reentrantReadWriteLock=null;
		//ReentrantReadWriteLock.ReadLock lock2=null;
		//ReentrantReadWriteLock.WriteLock lock3=null;
		LockSupport lockSupport=null;
		
		DateTimeException dateTimeException=null;
		Duration duration=null;
		Instant instant=null;
		LocalDate localDate=null;
		LocalDateTime localDateTime=null;
		LocalTime localTime=null;
		MonthDay monthDay=null;
		Period period=null;
		Year year=null;
		YearMonth yearMonth=null;
		ZonedDateTime zonedDateTime=null;
		DateTimeFormatter dateTimeFormatter=null;
		//java.util.function  API java8
		//
		
		Iterator<String> iterator=null;
		ListIterator<String> listIterator=null;
		Collection<String> collection=null;
		Enumeration<Integer> enumeration=null;
		
	}

}
