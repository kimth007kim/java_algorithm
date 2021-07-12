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
//		1. 현재 방향에서 왼쪽으로 돈다. 
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

//		2. 왼쪽방향에 아직가보지 않은 칸이 존재하면 회전한다음 왼쪽으로 한칸 전진 or 가봤으면 회전만
//		3. 네방향 이미가봤으면 바라보는 방향 유지한채로 1단계로 돌아감 
//		4. 뒤쪽이 바다면 정지
		
		System.out.println(cnt);
	}

}
