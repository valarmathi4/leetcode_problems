class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(robRange(nums,0,n-2),robRange(nums,1,n-1));
    }
    private int robRange(int[] nums,int st,int end){
        int[] dp=new int[nums.length];
        if(st==end){
            return nums[st];
        }
        dp[st]=nums[st];
        dp[st+1]=Math.max(nums[st],nums[st+1]);
        for(int i=st+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}