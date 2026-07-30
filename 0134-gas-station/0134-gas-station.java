class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int dif=0;
        int totalgas=0;
        int totalcost=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
dif=gas[i]-cost[i];
totalgas+=dif;
totalcost+=dif;

           
            if(totalgas<0){
                index=i+1;
                totalgas=0;
            }
        }
         if(totalcost<0){
                return -1;
            }
        return index;
    }
}