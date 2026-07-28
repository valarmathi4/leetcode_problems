class Solution {
    public int climbStairs(int n) {
       /* int dp[]=new int[n+1];
        int max=0;
        dp[0]=1;
        dp[1]=2;*/
        if(n<=2){
            return n;
        }/*
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            max=Math.max(max,dp[i]);
        }
        return max;*/
        int a=1,b=2,c=0;
        for(int i=2;i<n;i++){
c=a+b;
a=b;
b=c;
        }
        return c;
    }
}