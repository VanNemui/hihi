package TuSach;

public class Book {
	private String tenSach;
	private int BookID;
	private int amount;
	private int available;

	public Book(String tenSach, int bookID, int amount, int available) {
		this.tenSach = tenSach;
		BookID = bookID;
		this.amount = amount;
		this.available = available;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

}
