package Dajikstra;
import java.util.Arrays;
// vÀÇ °¹¼ö°¡ n°³
// eÀÇ °¹¼ö°¡ e°³
class Solution {
    public  int[] parent = new int[102];

    public  int findParent(int x){
        if (x==parent[x]) return x;
        return parent[x]= findParent(parent[x]);
    }

    public  void unionParent(int a, int b){
        a= findParent(a);
        b= findParent(b);
        if(a<b) parent[b]=a;
        else parent[a]=b;
    }
    public int solution(int n, int[][] wires) {
        int tmp1=0;
        int countMax=0;
        int countMin=0;
        int minNum=1000;
        int maxNum=-1000;
        int arr[]= new int[n-1];
        for(int a=0; a<wires.length;a++){
            countMax=0;
            countMin=0;
            for (int b=1; b<=n;b++){
                parent[b]=b;
            }   
            for(int i=0;i<wires.length;i++){
                if (a==i){
                    continue;
                }
                for (int j=0;j<2;j++){
                    System.out.println(j);
                        if(j==0){
                            tmp1=wires[i][j];
                            // System.out.println(tmp1+" "+wires[i][j]);

                        }else{
                            unionParent(tmp1,wires[i][j]);
                            // System.out.println(tmp1+" "+wires[i][j]);
                        }
                    }

            }

             for (int b=1; b<=n;b++){
                findParent(b);
                if (parent[b]>maxNum)
                    maxNum=parent[b];
                 if(parent[b]<minNum)
                     minNum=parent[b];
            }    
            for (int c=1; c<=n;c++){
                if (parent[c]==minNum)
                    countMin+=1;
                else if (parent[c]==maxNum)
                    countMax+=1;
            }
            if (countMax>countMin)
                arr[a]=countMax-countMin;
            else
                arr[a]=countMin-countMax;

            // System.out.println(Arrays.toString(parent));
        }
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(parent));

        return arr[0];
    }
}