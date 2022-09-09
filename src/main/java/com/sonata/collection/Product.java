package com.sonata.collection;

public class Product implements Comparable<Product>{
	int pId;
	String pName;
	double pPrice;
	public Product(int pId,String pName,double pPrice) {
		this.pId=pId;
		this.pName=pName;
		this.pPrice=pPrice;
	}
	public int compareTo(Product p11) {
		if(pPrice==p11.pPrice)
			return 0;
		else if(pPrice>pPrice)
			return 1;
		else
			return -1;

}

}
