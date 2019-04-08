package com.scp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class TestSorting {
		public static void main(String[] args) {
			System.out.println("testsorting..!");
			Address addr1 = new Address(110201,"Pune");
			Address addr2 = new Address(450201,"Mumbai");
			Address addr3 = new Address(660201,"Bglore");
			
			Author a1 = new Author(101,"5Aacbasassa");
			Author a2 = new Author(421,"AAbasassa");
			Author a3 = new Author(21,"AAbasassa");
			Author a4 = new Author(41,"BBebasassa");
			
			
			Book b1 = new Book(212,"abxuasu", 784.34, a3, addr1);
			Book b2= new Book(162,"Axuasu", 363.34, a1, addr2);
			Book b3 = new Book(231,"urbxuasu", 3584.34, a2, addr2);
			Book b4 = new Book(162,"Axuasu", 3484.34, a1, addr1);
			Book b5 = new Book(12,"df12uasu", 1384.34, a3, addr3);
			
			List<Book> listOfBooks = new ArrayList<Book>();
			listOfBooks.add(b1);
			listOfBooks.add(b3);
			listOfBooks.add(b2);
			listOfBooks.add(b5);
			listOfBooks.add(b4);

			TreeMap<Book,String> booksTree = new TreeMap<>(BookSortingSequences.nameSort);
			booksTree.put(b1,"V1");
			booksTree.put(b2,"V2");
			booksTree.put(b3,"V3");
			booksTree.put(b4,"v4");
			booksTree.put(b5,"v5");
			
			
			System.out.println(booksTree);
			
			System.out.println(booksTree.comparator() == BookSortingSequences.nameSort);
			
			
			if(true)
				return;
			
			System.out.println("Using id sort");
			Collections.sort(listOfBooks,BookSortingSequences.idSort);
			System.out.println(listOfBooks);
			System.out.println("----------------------------------------------------------------------------\n");
			System.out.println("using namesort");
			Collections.sort(listOfBooks,BookSortingSequences.nameSort);
			System.out.println(listOfBooks);
			System.out.println("----------------------------------------------------------------------------\n");
			System.out.println("using pricesort");
			Collections.sort(listOfBooks,BookSortingSequences.priceSort);
			System.out.println(listOfBooks);
			System.out.println("----------------------------------------------------------------------------\n");
			System.out.println("using addresscitysort");
			Collections.sort(listOfBooks,BookSortingSequences.addressCitySort);
			System.out.println(listOfBooks);
			System.out.println("----------------------------------------------------------------------------\n");
		}
}

	//Associatation -- how ur entities are associated with each other
//Aggregation 		Composition
 //loosly coupled		tightly coupled

//class Parent
//class Child extends Parent  -- is a realtionship -- inheritance


class BookSortingSequences{

	public static Comparator<Book> idSort = new Comparator<Book>(){ //BookSortingSequences$1
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getBookId() - o2.getBookId();
		}
	};
	
	
	public static Comparator<Book> nameSort = new Comparator<Book>(){ //BookSortingSequences$2
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getBookName().compareTo(o2.getBookName());
		}
	};
	
	
	public static Comparator<Book> priceSort = new Comparator<Book>(){
		@Override
		public int compare(Book o1, Book o2) {
			return (int) (o1.getBookPrice() - o2.getBookPrice());
		}
	};
	
	
	
	public static Comparator<Book> addressCitySort = new Comparator<Book>(){
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
		}
	};
	
}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Book implements Comparable<Book>{
	private int bookId;
	private String bookName;
	private double bookPrice;
	private Author author;
	private Address address;
	
	public int compareTo(Book o) {
		int temp = this.bookId - o.bookId;
		
		if(temp == 0){
			temp = this.bookName.compareTo(o.getBookName());
			if(temp == 0){
				temp =(this.getAddress().getCity().compareTo(o.getAddress().getCity()));
			}
		}else{
			temp = -temp;
		}
		return temp;
	}
	
	
	
	@Override
	public String toString() {
		return "\n  [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookPrice=" + bookPrice + ", author=" + author
				+ ", address=" + address + "]";
	}
	
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Author{
	private int authorId;
	private String authorName;
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Address{
	private int pinCode;
	private String city;
	
}

/**

	
	Comparable
	natuaral sorting-- Collections.sort(list)--- list-- Object of type comparable
	int compareTo(ob1) -- 
	Collections.sort(list)
	maximum -- only one sorting seq will be there...
	if you want to make change..then we shud make coding changes..
	always your natural sorting logic resides in domain entity
			0 -- both LHS=RHS
			+ -- LHS>RHS
			- -- LHS<RHS





	Comparator
	customized/user defined sorting..
	int compare(o1,o2)
	boolean equals()
*/