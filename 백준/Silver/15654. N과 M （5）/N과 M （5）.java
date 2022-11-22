import java.io.*;
import java.util.*;

public class Main {
    /*
    1초, 512MB
     */
    static int n, m;
    static int[] arr;
    static int[] nums;
    static boolean[] isUsed = new boolean[10000];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        func(0);
        bw.flush();
        bw.close();
    }

    public static void func(int num) throws Exception {
        if (num == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isUsed[nums[i]]) {
                arr[num] = nums[i];
                isUsed[nums[i]] = true;
                func(num + 1);
                isUsed[nums[i]] = false;
            }
        }
    }
}