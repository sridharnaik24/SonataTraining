package com.sonata.caltest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;



import com.sonata.cal.calculator;

public class ClassTest {
	@Test
	public void addTest(){
		calculator c1=new calculator();
		Assertions.assertEquals(20,c1.sum(10,10));
		Assertions.assertEquals(100,c1.mul(10,10));
	}
	@Test
	public void addTest2(){
		calculator c2=new calculator();
		Assertions.assertEquals(110,c2.sum(100,10));
		Assertions.assertEquals(1000,c2.mul(100,10));
	}
	@Test
	public void divTest1(){
		calculator c2=new calculator();
		
		assertThrows(ArithmeticException.class,()->c2.div(1,0),"it is an error");
		
	}


}
