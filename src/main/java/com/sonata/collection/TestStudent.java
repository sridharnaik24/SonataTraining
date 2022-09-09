package com.sonata.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(101,"sid",23));
		a1.add(new Student(102,"sri",28));
		a1.add(new Student(103,"deepak",32));
		// TODO Auto-generated method stub
Collections.sort(a1);
for(Student st:a1) {
	System.out.println(st.rollno+" "+st.name+" "+st.age);
}
	}

}
