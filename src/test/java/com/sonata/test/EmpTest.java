package com.sonata.test;
import com.sonata.model.Employee1;
import com.sonata.impl.*;


	import org.junit.Test;
	import org.junit.jupiter.api.Assertions;



	public class EmpTest {
		@Test
		public void addTest(){
			
			Empiml c1=new Empiml();
			Employee1 e1=new Employee1();
			e1.setSal(1000);
			double a= c1.yearlysal(e1);
			double b=c1.appsal(e1);
			Assertions.assertEquals(12000,a);
			Assertions.assertEquals(5000,b)
		;
		}
/*@Test
		public void addTest2(){
			calculator c2=new calculator();
			Assertions.assertEquals(110,c2.sum(100,10));
			Assertions.assertEquals(1000,c2.mul(100,10));
		}*/
		@Test
		public void addTest1(){
			
			Empiml c1=new Empiml();
			Employee1 e1=new Employee1();
			e1.setSal(10000);
			double a= c1.yearlysal(e1);
			double b=c1.appsal(e1);
			Assertions.assertEquals(120000,a);
			Assertions.assertEquals(1000,b)
		;
		}


	}



