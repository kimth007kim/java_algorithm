import java.util.Scanner;

public class Ex_03_01_2 {

	public static void main(String[] args) {
		int cnt,money,change,coin500,coin100,coin50,coin10;
		
		cnt=0;
		Scanner sc = new Scanner(System.in);
		
		money=sc.nextInt();
		System.out.println(money);
	
		change=money % 500;
		coin500= money / 500;
		System.out.println(change);
		cnt+=coin500;
		money=change;
		change=money % 100;
		coin100= money / 100;
		cnt+=coin100;
		money=change;
		change=money % 50;
		coin50= money / 50;
		cnt+=coin50;
		money=change;
		change=money % 10;
		coin10= money / 10;
		cnt+=coin10;
		money=change;
	
		System.out.println(cnt);
	}

}
