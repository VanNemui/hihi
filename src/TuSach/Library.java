package TuSach;

public class Library {
	private String LibraryName;
	private Book[] bookList;
	private int numberOfBooks;
	public int MAX_NUMBER_OF_BOOK = 100;
	
	public Library(String libraryName, Book[] bookList, int numberOfBooks, int mAX_NUMBER_OF_BOOK) {
		LibraryName = libraryName;
		this.bookList = bookList;
		this.numberOfBooks = numberOfBooks;
		MAX_NUMBER_OF_BOOK = mAX_NUMBER_OF_BOOK;
	}

	public String getLibraryName() {
		return LibraryName;
	}

	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}

	public Book[] getBookList( ) {
		return bookList;
	}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public int getMAX_NUMBER_OF_BOOK() {
		return MAX_NUMBER_OF_BOOK;
	}

	public void setMAX_NUMBER_OF_BOOK(int mAX_NUMBER_OF_BOOK) {
		MAX_NUMBER_OF_BOOK = mAX_NUMBER_OF_BOOK;
	}
	
	public void libraryName() {
		System.out.println("Ten thu vien: " + this.LibraryName);
	}
}
