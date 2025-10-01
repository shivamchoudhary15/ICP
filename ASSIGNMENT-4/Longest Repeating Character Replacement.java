class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt=new int[26];
        int l = 0, r = 0, max =0,res =0;
        while (r < s.length()) {
            cnt[s.charAt(r)-'A']++;
            max =Math.max(max, cnt[s.charAt(r) - 'A']);
            while (r-l+1 -max > k) {
                cnt[s.charAt(l)-'A']--;
                l++;
            }

            res = Math.max(res.r-l+ 1);
            r++;
        }

        return res;
    }
}
