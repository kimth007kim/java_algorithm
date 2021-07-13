import java.util.*;

class Banl {
    public void cut(int money,ArrayList<Integer> bank){
        money+=bank.get(bank.size()-1);
        bank.remove(bank.size()-1);
        if (money>0){
            bank.add(money);
            return;
        } else {
            cut(money,bank);
        }
        // return 0;
    }

    public int[] solution(int[] deposit) {
        ArrayList<Integer> bank= new ArrayList<Integer>();
        int tmp;
        for(int i=0; i<deposit.length;i++){
            if (deposit[i]<0){
            	int j=i;
            	int k=i-1;
            	if (deposit[j]+deposit[k]>0)
            		deposit[k]=deposit[j]+deposit[k];
            	else {
            		j-=1;
            		k-=1;
            		
            	}
            	
                // tmp=deposit[i];
                cut(deposit[i],bank);
            }else{
                bank.add(deposit[i]);
            }
            System.out.println(bank);
        }
        int n= bank.size();

        int[] answer = new int[n];

        for(int i =0; i<n;i++){
            answer[i]=bank.get(i);
        }
        return answer;
    }
}