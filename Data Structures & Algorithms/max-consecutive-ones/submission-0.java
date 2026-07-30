class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int prvCnt = 0;
        for(int i : nums){
            if(i == 1){
                cnt++;
            }else{
                prvCnt = Math.max(prvCnt, cnt);
                cnt = 0;
            }
        }

        return Math.max(prvCnt, cnt);
    }
}