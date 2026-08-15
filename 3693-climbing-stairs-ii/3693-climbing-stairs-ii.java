class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int dp[]=new int[n+1];
         dp[0]=0;
        
        for(int j=1;j<=n;j++){
            dp[j]=Integer.MAX_VALUE;
            for(int i=Math.max(0,j-3);i<j;i++){
                dp[j]=Math.min(dp[j],dp[i] + costs[j-1] + (j-i)*(j-i));
            }
        }
        return dp[n];
    }
}