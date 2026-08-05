class Solution {
    public int majorityElement(int[] nums) {
        int newele=0;
        int ct=0;
for(int i=0;i<nums.length;i++){
    if(ct==0){
newele=nums[i];
    }
    if(newele==nums[i]){
        ct++;
    }
    else{
        ct--;
    }
}
return newele;
    }
}