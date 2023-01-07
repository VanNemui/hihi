package hoc;

import java.util.Objects;

/* equals dùng để so sánh bằng 2 đối tượng
 * mục đích: xem hai đối tượng có bằng nhau không
 * equals: so sánh bằng
 */
public class equals {
	private int Day;
	private int Month;
	private int Year;

	public equals(int day, int month, int year) {
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

	@Override
	public int hashCode() {
		return Objects.hash(Day, Month, Year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equals other = (equals) obj;
		
		return Day == other.Day && Month == other.Month && Year == other.Year;
	}

	
	
}
