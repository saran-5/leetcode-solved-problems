class Solution {
    public int largestRectangleArea(int[] heights) {
         Deque<Integer> stack = new ArrayDeque<>();
        int max=0, n=heights.length;
        for(int i=0; i<=n; i++)
        {
            int curHeight = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > curHeight)
            {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                max = Math.max(height*width, max);
            }
            stack.push(i);
        }
        return max;
    }
}