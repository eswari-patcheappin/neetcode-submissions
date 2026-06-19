class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[]bucket=new ArrayList[nums.length+1];
        for(int num:freq.keySet()){//4
            int val=freq.get(num);//2  (4->2times)
            if(bucket[val]==null)bucket[val]=new ArrayList<>();
            bucket[val].add(num);//2 index la 4 add agum
        }
        int arr[]=new int[k], ind=0;
        for(int i=bucket.length-1;i>=0 && ind<k;i--){
            if(bucket[i]!=null){
                for(int val:bucket[i]){
                    arr[ind++]=val;
                    if(ind==k)break;
                }
            }
        }
        return arr;
    }
}
