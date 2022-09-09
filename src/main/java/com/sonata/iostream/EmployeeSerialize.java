package com.sonata.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {

	public static void main(String args[]) throws IOException{
		
		Employee obj =new Employee(123,"sid","kadirenahalli");
		ObjectOutputStream oos=null;
		FileOutputStream fos=null;
		Employee ob=null;
		try {
			fos=new FileOutputStream("D:\\Employee.ser");
			
			oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
		}
		finally{
			oos.close();
			fos.close();
		}
		System.out.println("serialization done");
		
		FileInputStream fis=new FileInputStream("D:\\Employee.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			ob=(Employee)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException s) {System.out.println(s);}
		System.out.println("Employee id:"+ob.getEmpId());
		System.out.println("Employee Add:"+ob.getEmpAdd());
		}
		

	}

