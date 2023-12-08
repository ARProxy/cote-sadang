import java.util.Scanner;

public class B_11727 {
    private static final int MOD = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = countTiling(n);

        System.out.println(result);
    }
    private static int countTiling(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1]+2*dp[i-2]) % MOD;
        }

        return dp[n];
    }
}
//동적 프로그래밍