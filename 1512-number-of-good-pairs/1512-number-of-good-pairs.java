class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0, c[] = new int[101];
        for (int a : nums) {
            ans += c[a]++;
        }
        return ans;
    }
}