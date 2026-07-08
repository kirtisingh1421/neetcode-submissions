class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        nge[n-1] = 0;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(st.size() > 0 && temperatures[st.peek()] <= temperatures[i]) st.pop();
            if(st.size() == 0) nge[i] = 0;
            else nge[i] = st.peek()-i;
            st.push(i);
        }
        return nge;
    }
}
