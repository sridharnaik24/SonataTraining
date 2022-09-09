package com.sonata.interfaceexample;

public class FunctionalIntf  {

	public void main(String args[]) {
		caTor c1=(a,b)->{return a+b;};
		caTor c3 =(a,b)->{
			if(b>a)
			{
				throw new RuntimeException("message");
			}else
			{
				return a+b;
			}
			
		};
		System.out.println(c1.add(10,20));
		System.out.println(c3.add(10,20));
	}
}
