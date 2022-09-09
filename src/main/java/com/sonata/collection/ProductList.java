package com.sonata.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class ProductList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Product> p1=new ArrayList<Product>();
p1.add(new Product(123,"TV",345));
p1.add(new Product(124,"Mobile",356));
p1.add(new Product(125,"Laptop",385));
Collections.sort(p1);
Collections.sort(p1);
for(Product p11:p1) {

	System.out.println(p11.pId+" "+p11.pName+" "+p11.pPrice);
}
/*LinkedList<String> l1=new LinkedList<String>();
int b=0;
l1.add("sid");
l1.add("sri");
l1.add("sridhar");

for(String l2:l1) {
	System.out.println(l2);
}
	
	
	Iterator<String> i1=l1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}*/
	
	
	}
}


