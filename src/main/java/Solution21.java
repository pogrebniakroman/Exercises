

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums, sum = 0;
        for (; ; ) {
            nums = Integer.parseInt(reader.readLine());
            sum += nums;
            if (nums == -1) break;
        }
        System.out.println(sum);
    }
}