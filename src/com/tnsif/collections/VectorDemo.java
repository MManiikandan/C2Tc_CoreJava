package com.tnsif.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> course=new Vector<>();
		System.out.println(course.add("CSE"));
		Iterator<String> iterate=course.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
		}
	}

}
