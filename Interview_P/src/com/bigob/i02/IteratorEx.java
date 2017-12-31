package com.bigob.i02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) throws InterruptedException {
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(9);
		set.add(11);
		set.add(8);
		set.add(4);
		set.add(5);
		Iterator<Integer> iterator=set.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			Thread.sleep(1000);
			iterator.remove();
			Thread.sleep(1000);
			System.out.println(".............................................................");
			System.out.println(set);
		}
	}
}
