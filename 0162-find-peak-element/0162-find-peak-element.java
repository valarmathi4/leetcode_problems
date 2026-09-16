class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                res=i;
            }
        }
        return res;
    }
}