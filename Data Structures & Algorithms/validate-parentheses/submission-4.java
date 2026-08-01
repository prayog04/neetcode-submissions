class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Map<Character,Character> bMap = new HashMap<>();
        bMap.put('(', ')');
        bMap.put('[', ']');
        bMap.put('{', '}');
        Stack<Character> st = new Stack<>();
        boolean isPush = false;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) != '}' && s.charAt(i) != ']' && s.charAt(i) != ')'){
                st.push(s.charAt(i));
                isPush = true;
            }else{
                if(!st.empty()){
                    if(bMap.get(st.peek()) == s.charAt(i)){
                        st.pop();
                    }else{
                        break;
                    }
                   
                }
            }
        }
        return isPush && st.empty();
    }
}
