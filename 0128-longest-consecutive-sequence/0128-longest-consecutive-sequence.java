class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);

        int longest=1;
        int countcurr=0;
        int lastsmall=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]-1 == lastsmall){
                countcurr=countcurr+1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall){
                countcurr=1;
                lastsmall=nums[i];
            }
            longest=Math.max(longest,countcurr);
        }
        return longest;
    }
}