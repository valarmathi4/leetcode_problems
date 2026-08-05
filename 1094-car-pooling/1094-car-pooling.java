class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] dif=new int[1004];
        for(int i=0;i<trips.length;i++){
            int pas=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            dif[from]+=pas;
            dif[to]-=pas;
        }
        int max=0;
        int cur=0;
        for(int i=0;i<1004;i++){
cur+=dif[i];
if(cur>capacity){
    return false;
}
        }
        return true;
    }
}