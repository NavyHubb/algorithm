package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2156 {

    static Integer[] dp;  // 배열 선언 시 초기값이 null이 되도록 하기 위해 int형이 아닌 Integer형 사용
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        dp = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1];

        if (N > 1) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(recur(N));
    }

    static int recur(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(Math.max(recur(N - 2), recur(N - 3) + arr[N - 1]) + arr[N], recur(N - 1));
        }

        return dp[N];
    }
}