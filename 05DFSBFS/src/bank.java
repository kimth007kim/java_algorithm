import java.util.*;

class Solution {
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