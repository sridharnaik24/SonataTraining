package com.sonata.collection;

import java.util.Comparator;

class MyCompator implements Comparator<Book>{
	 public int compare(Book o1,Book o2) {
		 return o1.getName().compareTo(o2.getName());
	 }
	

}
