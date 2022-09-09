package com.sonata.collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class BookService {
	public List<Book>getBookinSort(){
		List<Book> books=new BookDAO().getBook();
		Collections.sort(books,new MyCompator());
		return books;
	}
	public static void main(String args[]) {
		System.out.println(new BookService().getBookinSort());
	}

}
