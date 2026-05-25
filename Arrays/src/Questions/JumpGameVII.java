package DSA.Arrays.Questions;

public class JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] dp = new boolean[n];

        dp[0] = true;

        for (int i = 0; i < n; i++) {

            if (!dp[i])
                continue;

            for (int j = i + minJump; j <= Math.min(i + maxJump, n - 1); j++) {

                if (s.charAt(j) == '0') {
                    dp[j] = true;
                }
            }
        }

        return dp[n - 1];
    }
}
