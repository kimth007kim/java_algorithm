import java.util.Arrays;
import java.util.Scanner;

public class Ex_04_04_gamedevelopement {
	public static int n, m, x, y, direction;
	public static int[][] d =new int[50][50];
	public static int[][] arr = new int[50][50];
	
	public static int dx[]= {-1,0,1,0};
	public static int dy[]= {0,1,0,-1};
	
//	public static void turn_left() {
//		direction -=1;
//		if(direction == -1) direction=3;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int x= sc.nextInt();
		int y=sc.nextInt();
		int direction = sc.nextInt();
		d[x][y]=1;
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int cnt=1;
		int turn_time = 0;
		
		
		while (true) {
//		1. ���� ���⿡�� �������� ����. 
//			System.out.println(direction);
			direction= (direction+3)%4;
			int nx=y+dx[direction];
			int ny=x+dy[direction];
			
			if (d[nx][ny]==0 && arr[nx][ny]==0) {
				d[nx][ny]=1;
				x=nx;
				y=ny;
				cnt+=1;
				turn_time=0;

				for(int i=0; i<n; i++) {
					System.out.println(Arrays.toString(d[i]));
				}
				
				continue;
			}else turn_time+=1;
			if (turn_time==4) {
				nx= x-dx[direction];
				ny=y-dy[direction];
				if(arr[nx][ny]==0) {
					x=nx;
					y=ny;
				}else break;
				turn_time=0;
			}
		}

//		2. ���ʹ��⿡ ���������� ���� ĭ�� �����ϸ� ȸ���Ѵ��� �������� ��ĭ ���� or �������� ȸ����
//		3. �׹��� �̹̰������� �ٶ󺸴� ���� ������ä�� 1�ܰ�� ���ư� 
//		4. ������ �ٴٸ� ����
		
		System.out.println(cnt);
	}

}
