package com.sonata4;

public class CallCustomException {

	public static void main(String[] args) throws MyCustomException {
		int age=21;
		if(age<18) {
			throw new MyCustomException("Age is less");
		}
		else {
			System.out.println("age is 18+");
		}

	}

}
