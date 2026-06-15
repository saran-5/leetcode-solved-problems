class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> a = new ArrayList<>();
        int m = 0;

        for(char ch : s.toCharArray()) {
            if(!a.contains(ch)) {
                a.add(ch);
            } else {
                m = Math.max(m, a.size());

                while(a.contains(ch)) {
                    a.remove(0);
                }

                a.add(ch);
            }
        }

        m = Math.max(m, a.size());
        return m;
    }
}