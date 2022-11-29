package week31;
//getter and setter là đảm bảo tính đóng gói của đối tượng
// getter là hiển thị giá trị của đối tượng
// setter là thiết lập lại giá trị của đối tượng

public class getAndSet {
	private int Day;
	private int Month;
	private int Year;

	public getAndSet(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.Day = day;
		} else
			this.Day = 1;
		if (month >= 1 && month <= 12) {
			this.Month = month;
		} else
			this.Month = 1;
		if (year >= 1) {
			this.Year = year;
		} else
			this.Year = 1;
	}

	public int getDay() {
		return this.Day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.Day = day;
	}

	public int getMonth() {
		return this.Month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.Month = month;
	}

	public int getYear() {
		return this.Year;
	}

	public void setYear(int year) {
		if (year >= 1)
			this.Year = year;
	}

}
