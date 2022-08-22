package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAddition;

class AddTestcase {

	@Test
	void test1() {
		Addinterface add=new DefaultAddition();
		assertEquals(40,add.add(20, 20));
	}

	@Test
	void test2() {
		Addinterface add=new DefaultAddition();
		assertEquals(2,add.add(1, 1));
	}

	@Test
	void test3() {
		Addinterface add=new DefaultAddition();
		assertEquals(0,add.add(1, -1
				
				
				
				));
	}


}
