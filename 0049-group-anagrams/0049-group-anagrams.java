class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String,List<String>> m = new HashMap<>();
        for(String n : s){
            char[] c = n.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!m.containsKey(sorted)){
                m.put(sorted, new ArrayList<>());
            }
            m.get(sorted).add(n);
        }
    return new ArrayList<>(m.values());
    }
}