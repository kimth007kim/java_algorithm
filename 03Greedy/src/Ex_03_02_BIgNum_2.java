import java.util.Arrays;
import java.util.Scanner;

public class Ex_03_02_BIgNum_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		
		int arr[]= new int[n];
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int n1= arr[n-1];
		int n2= arr[n-2];
		
		int result =0;
				
		for (int i=0;i<m;i++) {
			if((i+1)%3==0) {
				result+=n2;
			}else {
				result+=n1;
			}
			System.out.println(result);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}

}
