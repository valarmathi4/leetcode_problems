class Solution {
    public int maxSubArray(int[] nums) {
        int s=0;
        int max=nums[0];
       
        for(int i=0;i<nums.length;i++){
s+=nums[i];
max=Math.max(max,s);
if(s<0){
    s=0;
}
        }
        return max;

    }
}