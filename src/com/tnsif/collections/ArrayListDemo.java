package com.tnsif.collections;

import java.io.Serializable;
import java.util.ArrayList;
public class ArrayListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Serializable> list1=new ArrayList();
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
        list1.add(10);
        list1.add("ram");
        list1.add(null);
        list1.add( list1);
        System.out.println(list1);
	}

}
