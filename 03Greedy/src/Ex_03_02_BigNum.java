
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
        int n = Integer.parseInt(st.nextToken()); // 배열의 크기
        int m = Integer.parseInt(st.nextToken()); // 숫자가 더해지는 횟수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 더할 횟수

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 오름차순 정렬
        int first = arr[arr.length-1]; // 가장 큰 수
        int second = arr[arr.length-2]; // 두번째로 큰 수

        int numFirst = (m / (k + 1)) * k + m % (k + 1); // 가장 큰 수가 더해지는 횟수
        int numSecond = m - numFirst; // 두번째로 큰 수가 더해지는 횟수

        int result = numFirst*first+numSecond*numSecond;


        bw.write(result+"\n");

        br.close();
        bw.close();

    }
}