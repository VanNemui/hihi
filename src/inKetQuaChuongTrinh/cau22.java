package inKetQuaChuongTrinh;

public class cau22 {
	public static void main(String[] args) {
		int i = 0;
		addTwo(i++);
		System.out.println(i);
	}

	static void addTwo(int i) {
		i += 2;
	}
	/*
	 * result: 1
	 * sau addTwo: i = i + 1 = 0 + 1 = 1
	 * in ra man hinh la bien i = 1
	 */
}
