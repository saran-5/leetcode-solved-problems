class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);

        int longest=1;
        int curr=0;
        int lastsmall=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]-1 == lastsmall){
                curr=curr+1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall){
                curr=1;
                lastsmall=nums[i];
            }
            longest=Math.max(longest,curr);
        }
        return longest;
    }
}