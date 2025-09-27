class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->(b-a));
       for(int i=0;i<nums.length;i++){
        q.add(nums[i]);
       }
       for(int i=1;i<k;i++){
           q.poll();
       }
       return q.peek();

    }

}
