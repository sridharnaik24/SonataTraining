package com.sonata.collection;

import java.util.*;

public class Example {
	public static void main(String args[]) {
	ArrayList a1=new ArrayList();
	a1.add("Sid");
	a1.add("abc");
  a1.add("Sid");
  System.out.println(a1);
  
  LinkedList l1 = new LinkedList(a1);
  l1.addFirst("os");
  l1.addLast("SHOW");
  System.out.println(l1);
  l1.removeLast();
  System.out.println(l1);
  
  HashSet h1 = new HashSet(l1);
  h1.add("os");
  System.out.println(h1);
  
  TreeSet t1=new TreeSet (h1);
  t1.add("msd");
  System.out.println(t1);
		  
  
}
}
