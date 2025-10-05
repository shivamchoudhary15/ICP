class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        for (int i = 1; i < n; i++) {
            res = res * (m + i - 1) / i;
        }
        return (int) res;
    }
}
