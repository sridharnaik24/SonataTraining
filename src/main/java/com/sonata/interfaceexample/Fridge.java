package com.sonata.interfaceexample;

public class Fridge implements Machine {
	private String brand1;
	public String getBrand1() {
		return brand1;
	}
	public void setBrand1(String brand1) {
		this.brand1=brand1;
	}
	public String speedup() {
		return "this fridge is cools very fast";
	}
	public String speeddown() {
		return "this fridge is cools very slow";
	}
	public static void main(String args[]) {
		Fridge f1=new Fridge();
		f1.setBrand1("samsung");
		
		System.out.println(f1.getBrand1());
		System.out.println(f1.TurnonAlarm());
		System.out.println(f1.TurnoffAlarm());
		System.out.println(f1.speedup());
		System.out.println(f1.speeddown());
	}
	}
	


