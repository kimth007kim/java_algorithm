import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Stringslice {
	
	static List<String> LeftList = new ArrayList<String>();
	static List<String> RightList = new ArrayList<String>();
	
	public static int check(String word) {
		int len=word.length();
		String left;
		String right;
		for(int i=1;i<len;i++) {
			left=word.substring(0,i);
			right= word.substring(len-i,len);
//			System.out.println(left);
//			System.out.println(right);
			if (left.equals(right)){
				LeftList.add(left);
				RightList.add(right);
				return i;
				
			}

		}
		LeftList.add(word);
		return len;
	}

	
	public static void main(String[] args) {
		
		int result;
		String word="abcdefghkghdefabc";
		int wlen= word.length();
		
		while (word.length()>0) {
			if (word.length()==1){
				LeftList.add(word);
				break;
			}
			result=check(word);
			word=word.substring(result,word.length()-result);
			
		}
		
		System.out.println(LeftList);
		System.out.println(RightList);
		
		
		for (int i=RightList.size()-1; i>=0 ;i--) {
//			System.out.println(i);
			LeftList.add(RightList.get(i));
//			System.out.println(RightList.get(i));
		}
		
		//LeftSize에 모든값을 집어넣음 list=>arrayList로 바꾸어야함
//		System.out.println(LeftList);
		String[] answer=new String[LeftList.size()];
		int size=0;
		for (String temp:LeftList) {
			answer[size++]=temp;
		}
		System.out.println(Arrays.toString(answer));
	}
		
	
	

}
