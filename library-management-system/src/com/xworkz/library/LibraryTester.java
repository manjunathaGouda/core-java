package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.Library;
import com.xworkz.library.crud.impl.LibraryImpl;
import com.xworkz.library.dto.BookDTO;

public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the books : ");
		int size = sc.nextInt();		
		Library lb = new LibraryImpl(size);
		for(int i=0;i<size;i++)
		{
			
			System.out.print("Enter ID of the book : ");
			int id=sc.nextInt();
			
			System.out.print("Enter name of the book : ");
			String name=sc.next();
			
			System.out.print("Enter name of the Author : ");
			String author=sc.next();
			
			System.out.print("Enter the year of publish : ");
			String publishedIn=sc.next();
			
			System.out.print("Enter stream of the book : ");
			String stream=sc.next();
			
			BookDTO bk = new BookDTO();
			bk.setId(id);
			bk.setName(name);
			bk.setAuthor(author);
			bk.setPublishedIn(publishedIn);
			bk.setStream(stream);
			lb.readAndGrow(bk);
		}
		String option=null;
		do{
			System.out.println("Enter 1 to fetch book details");
			System.out.println("Enter 2 to update book details by id");
			System.out.println("Enter 3 to delete book details by name");
			System.out.println("Enter 4 to delete book contactNo by author");
			
			
			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();
			
		switch(choice){
			case 1 : lb.getBooks();
			         break;
					 
			case 2 :System.out.print("Entre the existing Id for update Book name : ");
	                int existingId = sc.nextInt();
	                System.out.print("Entre the updated Book name : ");
	                String updateName=sc.next();
	                lb.updateBookNameById(existingId , updateName);
					 break;
					 
			case 3 : System.out.print("Enter the existing name for delete Book: ");
	                 String existingName = sc.next();
	                 lb.deleteBookByName(existingName);
					 break;
					 
			case 4 : System.out.print("Enter the existing author for delete Book: ");
	                 String existingauthor = sc.next();
	                 lb.deleteBookByAuthor(existingauthor);
					 break;
			
					 
			default : System.out.println("Enter the proper number");
			         break;
				
		}	
		System.out.println("Do you want to continue Y/N : ");				
			option = sc.next();
		}
		while(option.equals("Y"));
		

	}
	
}


