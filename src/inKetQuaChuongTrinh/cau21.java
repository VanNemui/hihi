package inKetQuaChuongTrinh;

public class cau21 {
	public static void main(String[] args) {
		String s = "ab" + "12";
		String t = "ab" + 12;
		String u = new String("ab12");
		System.out.println((s==t) + " " + (s==u));
		/*
		 * Ket qua tra ve: true false
		 * true: so sanh hai chuoi s va t
		 * false: khong the so sanh chuoi s voi doi tuong u
		 */
	}
}
