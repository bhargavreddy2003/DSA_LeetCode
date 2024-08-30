class Solution {
    public int evalRPN(String[] tokens) {
        int el1;
        int el2;
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")) 
            {
               st.push(Integer.parseInt(tokens[i]));
              continue;
            }
            String symb= tokens[i];

            switch(symb){
                case "+":
                         el1=st.pop();
                         el2=st.pop();
                         st.push(el2+el1);
                         break;
                case "-":
                         el1=st.pop();
                         el2=st.pop();
                         st.push(el2-el1);
                         break;
                case "*":
                         el1=st.pop();
                         el2=st.pop();
                         st.push(el2*el1);
                         break;
                case "/":
                         el1=st.pop();
                         el2=st.pop();
                         st.push(el2/el1);
                         break;                  
                        
            }
               

        }
        return st.pop();
    }
}