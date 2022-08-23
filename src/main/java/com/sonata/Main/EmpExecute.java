package com.sonata.Main;

import com.sonata.impl.Empiml;
import com.sonata.model.Employee1;

public class EmpExecute {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		Empiml e2 =new Empiml();
		e1.setEmpid(123);
		e1.setName("sid");
		e1.setSal(10001);
		System.out.println(e2.yearlysal(e1));
		System.out.println(e2.appsal(e1));
		

	}

}
