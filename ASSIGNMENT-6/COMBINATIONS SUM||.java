class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(c);
        dfs(c,t,0,new ArrayList<>(), res);
        return res;
    }

    void dfs(int[] c,int t , int idx, List<Integer> path, List<List<Integer>> res) {
        if(t==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<c.length;i++) {
            if(i>idx && c[i]==c[i - 1]) {
              continue;
            } 
            if(c[i] > t) break;
            path.add(c[i]);
            dfs(c,t-c[i],i + 1,path,res);
            path.remove(path.size()-1);
        }
    }
}
