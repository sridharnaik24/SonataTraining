package com.sonata.collection;
import java.util.*;

public class GenericEx {
	public static <E> void simpleArray(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String args[]) {
		EmpGn<Integer> gm =new EmpGn<Integer>();
		gm.add(12);
		EmpGn<String> gm1 =new EmpGn<String>();
		System.out.println(gm.get());
		Integer[] a1= {10,20,30};
		simpleArray(a1);
		
		
		
		

}
}
