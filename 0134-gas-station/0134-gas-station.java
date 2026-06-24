class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0,tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc) return -1;
        int regas=0,st=0;
        for(int i=0;i<gas.length;i++){
            regas=regas+(gas[i]-cost[i]);
            if(regas<0){
                st=i+1;
                regas=0;
            }
        }
        return st;
    }
}