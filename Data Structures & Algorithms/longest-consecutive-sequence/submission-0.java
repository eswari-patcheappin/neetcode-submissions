class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int val:set){
            if(!set.contains(val-1)){
                int cur=val, len=1;
                while(set.contains(cur+1)){
                    cur++;len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}
