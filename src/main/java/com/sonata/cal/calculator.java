package com.sonata.cal;





public class calculator {
	public int sum(int a,int b) {
		return a+b;
	}public int mul(int a,int b) {
		return a*b;
	}public int div(int a,int b) {
		return a/b;
	}
	public static void main(String args[]) {
		calculator c1=new calculator();
	
		System.out.println(c1.sum(10,10));
		System.out.println(c1.mul(10,10));
	}

}
