class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sc = new Stack<>();
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i!='#'){
                sc.push(i);
            }
            else if(!sc.isEmpty()){
                sc.pop();
            }
        }
        for(char i : t.toCharArray()){
            if(i!='#'){
                st.push(i);
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        return sc.equals(st); 
    }
}