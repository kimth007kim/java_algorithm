
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_03_02_BigNum {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // �迭�� ũ��
        int m = Integer.parseInt(st.nextToken()); // ���ڰ� �������� Ƚ��
        int k = Integer.parseInt(st.nextToken()); // �����ؼ� ���� Ƚ��

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        // �迭 �Է�
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // �迭 �������� ����
        int first = arr[arr.length-1]; // ���� ū ��
        int second = arr[arr.length-2]; // �ι�°�� ū ��

        int numFirst = (m / (k + 1)) * k + m % (k + 1); // ���� ū ���� �������� Ƚ��
        int numSecond = m - numFirst; // �ι�°�� ū ���� �������� Ƚ��

        int result = numFirst*first+numSecond*numSecond;


        bw.write(result+"\n");

        br.close();
        bw.close();

    }
}