class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int areamax=0;
        
        while(left<right){
            int width=right-left;
            int heightmin=Math.min(height[left],height[right]);
            int area=width*heightmin;
            areamax=Math.max(areamax,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return areamax;
    }
}