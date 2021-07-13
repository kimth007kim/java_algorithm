import java.util.ArrayList;
import java.util.Arrays;

public class answer {
	
//	public void cut(int money,ArrayList<Integer> bank){
//		money+=bank.get(bank.size()-1);
//		bank.remove(bank.size()-1);
//		if (money>0){
//			bank.add(money);
//			return;
//		} else {
//			cut(money,bank);
//		}
		// return 0;
		public static int[] solution() {
			int [] deposit= {500,300,-600,1000,500,-500};
			ArrayList<Integer> bank= new ArrayList<Integer>();
			int tmp;
			for(int i=0; i<deposit.length;i++){
				if (deposit[i]<0){
					int j=i;
					int k=i-1;
					deposit[k]+=deposit[j];
					if (deposit[k]<0)
						j--;
						k--;
						deposit[k]=deposit[j]+deposit[k];
//					else {
//						j-=1;
//						k-=1;
//						continue;
//					}
					
				}else{
					bank.add(deposit[i]);
				}
//				System.out.println(bank);
			}
			int n= bank.size();
			
			int[] answer = new int[n];
			
			for(int i =0; i<n;i++){
				answer[i]=bank.get(i);
			}
			return answer;
		}
		
	public static void main(String[] args) {
		System.out.println(Arrays.toString(answer.solution()));

	
	}
	}


