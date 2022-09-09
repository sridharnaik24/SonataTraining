package com.sonata.collection;
import static org.junit.Assert.*;

import org.junit.Test;
public class ArrayListTest {
	@Test
	public void testadd() {
		ArrayListDemo a1=new ArrayListDemo();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		int size=a1.getSize();
		System.out.println(size);
		assertEquals(5,size);
	}
	@Test
	public void testadd1() {
		ArrayListDemo a5=new ArrayListDemo();
		a5.add(1);
		a5.add(2);
		a5.add(3);
		a5.add(4);
		a5.add(5);
		a5.delete(5);
		int size=a5.getSize();
		System.out.println(size);
		assertEquals(5,size);
	}

}
