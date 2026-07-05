class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.length() % 2 != 0) return false; 
            char ch = s.charAt(i);
            if(ch == '{' || ch =='(' || ch =='[') st.push(ch);
            else{
                if(st.size() == 0) return false;
                char top = st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
    public boolean sameStyle(char a, char b){
        if(a == '(' && b ==')') return true;
        if(a == '{' && b =='}') return true;
        if(a == '[' && b ==']') return true;
        else return false;
    }
}
