class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        sub(nums, new ArrayList<>(), 0, res);
        return res;
    }
    public void sub(int[] nums, List<Integer> ans, int i, List<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(ans)); 
            return;
        }
        ans.add(nums[i]);       
        sub(nums, ans, i + 1, res);
        ans.remove(ans.size() - 1);
        sub(nums, ans, i + 1, res); 
    }
}