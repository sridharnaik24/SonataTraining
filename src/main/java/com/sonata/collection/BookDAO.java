package com.sonata.collection;
import java.util.ArrayList;
import java.util.List;
public class BookDAO {
	public List<Book>getBook(){
		
	
		List<Book> books=new ArrayList<>();
		books.add(new Book(101,"core java",400));
		books.add(new Book(102,"hibernet",300));
		books.add(new Book(103,"spring",200));
		books.add(new Book(104,"reactjs",200));
		return books;
	}
	
}


	