import java.io.*;
import java.util.*;
public class Main {
    /*
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int num : list) {
			if (num == v) {
				cnt++;
   			}
		}
		System.out.println(cnt);
    }
}