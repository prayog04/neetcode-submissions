class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] last = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(last);
        return Arrays.equals(first, last);        
    }
}
