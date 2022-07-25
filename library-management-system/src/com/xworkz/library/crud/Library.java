package com.xworkz.library.crud;

import com.xworkz.library.dto.BookDTO;

public interface Library {
	
	public boolean readAndGrow(BookDTO bk);
	public void getBooks();
	public boolean updateBookNameById(int id , String name);
	public boolean deleteBookByName(String name);
	public boolean deleteBookByAuthor(String author);
	
}
