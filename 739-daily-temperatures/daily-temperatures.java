class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st= new Stack<>();
        int [] sol= new int[temperatures.length];
        for(int i=0; i<temperatures.length;i++){
             while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int temp= st.pop();
                sol[temp]=i-temp;
                
             }
             st.push(i);
           


        }
        return sol;
    }
}