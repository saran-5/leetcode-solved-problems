class Solution {
    public int longestConsecutive(int[] n) {
        if(n.length==0){
            return 0;
        }
        Set<Integer> m = new HashSet<>();
        for(int s : n){
            m.add(s);
        }
        int l=0;
        for(int s: m){
            if(!m.contains(s-1)){
                int cn=s;
                int cs=1;
                while(m.contains(cn+1)){
                    cn++;
                    cs++;
                }
                l=Math.max(l,cs);
            }
        }
        return l;
    }
}