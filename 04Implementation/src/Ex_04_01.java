import java.util.Scanner;

public class Ex_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		int y = 1;
		for (int i = 0; i < n; i++) {
			String d = sc.next();
			System.out.println(d);
			if (d.equals("D")) {
				if (x + 1 <= n) {
					x += 1;
				}
			} else if (d.equals("U")) {
				if (x - 1 >= 0) {
					x -= 1;
				}
			} else if (d.equals("L")) {
				if (y + 1 <= n) {
					y += 1;
				}
			} else if (d.equals("R")) {
				if (y - 1 >= 0) {
					y -= 1;
				}
			}
		}
		System.out.println(x);
		System.out.println(x+"-"+y);

	}

}
