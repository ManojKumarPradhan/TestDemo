package com.bigob.i02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorEx {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		/*
		System.out.println(list);
		
		Iterator<Integer> iterator=list.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.hasNext());
		System.out.println(iterator);
		System.out.println(list);
		
		System.out.println(".......................................................");*/
		
		//ListIterator
		
		ListIterator<Integer> listIterator=list.listIterator();
		System.out.println(listIterator.previousIndex());
		//System.out.println(listIterator.previous());
		System.out.println("....................................................................");
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.hasNext());
		listIterator.add(122);
		//listIterator.set(123);
		System.out.println(list);
		System.out.println(listIterator.next());
		listIterator.set(123);
		System.out.println(list);
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasNext());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		
		System.out.println(listIterator.previousIndex());
		System.out.println(listIterator.nextIndex());
		
		
		System.out.println("..............................................................");
		System.out.println(list);
		
		
	}
}
