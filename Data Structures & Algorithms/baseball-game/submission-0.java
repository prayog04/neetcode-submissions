class Solution {
    public int calPoints(String[] operations) {
        int len = operations.length;
        List<Integer> st = new ArrayList<>(len);
        int ind=0;
        for(int i=0;i<len;i++){
            int val = 0;
            String str = operations[i];
            if(!str.equals("+") && !str.equals("D") && !str.equals("C") ){
                val = Integer.parseInt(str);
                st.add(val);
                ind++;
            }else{
                switch(str){
                    case "+": st.add(st.get(ind-1) + st.get(ind-2));
                    ind++;
                    break;
                    case "C": st.remove(ind-1);
                    ind--;
                    break;
                    case "D": st.add(st.get(ind-1)*2);
                    ind++;
                    break;
                }
            }
           
        }

        int result = 0;
        for(int j=0;j<st.size();j++){
            result += st.get(j);
        }
        return result;
    }
}