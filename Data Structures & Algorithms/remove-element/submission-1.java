class Solution {
    public int removeElement(int[] nums, int val) {
        int curr = 0;
        int len = nums.length;
        for(int i=0; i<len;i++){
            if(val != nums[i]){
              nums[curr++] = nums[i];
            }
        }
        return curr;
}
}