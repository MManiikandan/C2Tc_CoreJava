package com.tnsif.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(-78);
        linkedList.add(890);
        ListIterator<Integer> li=linkedList.listIterator();
        while(li.hasNext()) {
        	System.out.println(li.next());
        }
        li=linkedList.listIterator(linkedList.size());
        
	}

}
