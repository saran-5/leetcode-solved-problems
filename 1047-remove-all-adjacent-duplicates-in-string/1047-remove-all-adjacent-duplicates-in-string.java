class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sc = new Stack<>();
        for(char i : s.toCharArray()){
            if(!sc.isEmpty()&&sc.peek()==i){
                sc.pop();
            }
            else{
                sc.push(i);
            }
        }
        StringBuilder r = new StringBuilder();
        for( char i : sc){
            r.append(i);
        }
        return r.toString();
    }
}