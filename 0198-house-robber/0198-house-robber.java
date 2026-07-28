class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
int max=0;
        int dp[]=new int[n+1];
        if(n<=1){
            return nums[0];
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);//suppose only  2 house we only take 1 max value
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);

        }
        return dp[n-1];
    }
}