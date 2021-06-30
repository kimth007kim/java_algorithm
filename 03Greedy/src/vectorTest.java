import java.util.Vector;

public class vectorTest {

	public static void main(String[] args) {
//		Vector<int> arr = new Vector<int>; ¿À·ù
		Vector<Integer> v= new Vector<Integer>();
		v.add(500);
		v.add(100);
		v.add(50);		
		v.add(10);
		
		System.out.println(v);
		int len=v.size();
		System.out.println(len);
		int cap=v.capacity();
		System.out.println(cap);
	
	}

}
