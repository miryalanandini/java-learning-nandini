package Day3;

import java.util.ArrayList;

public class Book {
	String title;
	String author;
	Boolean isIssued;
	
	public Book(String title, String author, Boolean isIssued) {
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }	
    public static void main(String[] args) {
        
    	 ArrayList<Book> bookList = new ArrayList<>();
    	 bookList.add(new Book("The Alchemist", "Paulo Coelho", false));
         bookList.add(new Book("Wings of Fire", "A.P.J Abdul Kalam", true));
         bookList.add(new Book("The Power of Habit", "Charles Duhigg", false));
         System.out.println("Library Book List:");
         System.out.println("----------------------------------");
         for (int i=1; i<=bookList.size();i++) {
        	 bookList.get(i).displayDetails();
         }
    }
}


