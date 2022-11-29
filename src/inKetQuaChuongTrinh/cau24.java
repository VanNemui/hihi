package inKetQuaChuongTrinh;

public class cau24 {
	public static void main(String s[]) {
		m(m(1) + m(2) % m(3) * m(4));
	}

	static int m(int i) {
		System.out.println(i + ", ");
		return i;
	}
}
