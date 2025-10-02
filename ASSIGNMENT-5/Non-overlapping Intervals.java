class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int min=0;
        int a=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(a>intervals[i][0]){
                min++;
            }
            else{
                a=intervals[i][1];
            }
        }
        return min;
    }
}
