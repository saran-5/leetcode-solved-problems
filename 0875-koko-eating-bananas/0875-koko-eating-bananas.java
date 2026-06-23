class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();

        while (min <= max) {
            int mid = min + (max - min) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}