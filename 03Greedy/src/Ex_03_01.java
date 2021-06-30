import java.util.ArrayList;
import java.util.Arrays;

public class Ex_03_01 {
	public static void main(String[] args) {
		int coin;
		int money =1260;
//		int arr [] = new int[3];
		int l []= {500,100,50,10};
		System.out.println(Arrays.toString(l));		//배열에 있는 값 확인하기
		
		int cnt=0;
		for (int i=0;i<l.length;i++) {
			coin =money / l[i];
			money-= coin*l[i];
			cnt+=coin;
//			System.out.println(money);
//			System.out.println(l[i]);
		}
		
		System.out.println(cnt);
	}
}
