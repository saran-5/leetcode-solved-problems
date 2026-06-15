class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s= new Stack<>();
        for(String n : operations){
            if(n.equals("+")){
                int top=s.pop();
                int nn=top+s.peek();
                s.push(top);
                s.push(nn);
            }
            else if(n.equals("D")){
                s.push(s.peek()*2);
            }
            else if(n.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(n));
            }
        }
        int sum =0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}