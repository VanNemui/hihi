package week31;

/* toString là để hiển thị một số thông tin của đối tượng
 * mà không cần phải ghi rõ trong hàm main
 * Nếu không dùng toString mà ghi trực tiếp tên của đối tượng 
 * thì sẽ hiển thị ra địa chỉ/ nơi cấp phát của đối tượng đó
*/
public class toString {
	private int Day;
	private int Month;
	private int Year;

	public toString(int day, int month, int year) {
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
	
	@Override
	public String toString() {
		return this.Day + "-" + this.Month + "-" + this.Year;
	}

}
