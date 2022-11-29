package Book;

public class BooK {
	private int bookID;
	private String bookTitle;
	private int ammount;
	private int available;
	
	public BooK(int bookID, String bookTitle, int ammount, int available) {
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.ammount = ammount;
		this.available = available;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

}
