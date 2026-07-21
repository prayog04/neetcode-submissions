class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] last = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(last);
        String sortedFirst = new String(first);
        String sortedLast = new String(last);
        if(sortedFirst.equals(sortedLast)){
            return true;
        }else{
            return false;
        }
        
    }
}
