import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_04_03_Knight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputData=sc.nextLine();
		int row=inputData.charAt(1)-'0';
		int column= inputData.charAt(0)-'A'+1;
		System.out.println(row);
		
		System.out.println(column);
		
		int[] dx= {-2,-1,1,2,2,1,-1,-2};
		int[] dy= {-1,-2,-2,-1,1,2,2,1};
		
		
		int result=0;
		for(int i=0;i<8;i++) {
			int nextRow =row+dx[i];
			int nextColumn = column+dy[i];
			if(nextRow>=1 && nextRow<=8 && nextColumn>=1 && nextColumn<=8) {
				result+=1;
				
			}
		}
		
		System.out.println(result);
	}

}