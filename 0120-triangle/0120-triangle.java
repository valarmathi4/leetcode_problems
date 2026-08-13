class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
   //bottom up
   //copy botom as base class
   int n=triangle.size();
   int dp[]=new int[triangle.size()];
   for(int j=0;j<n;j++){
    dp[j]=triangle.get(n-1).get(j);//we copied last row 
   }
   for(int i=n-2;i>=0;i--){//we already copy last row 3
    for(int j=0;j<=i;j++){
        dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
    }
   }
   return dp[0];
    }
}