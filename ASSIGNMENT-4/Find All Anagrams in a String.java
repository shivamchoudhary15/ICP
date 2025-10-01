class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if (s.length()<p.length()) return ans;

        int[] pCount=new int[26];
        int[] sCount=new int[26];

        for (char c:p.toCharArray()) {
            pCount[c-'a']++;
        }

        int len=p.length();
        for (int i=0;i<s.length();i++) {
            sCount[s.charAt(i)-'a']++;
            if(i>=len){
                sCount[s.charAt(i - len)-'a']--;
            }
            if (isSame(pCount, sCount)) {
                ans.add(i - len + 1);
            }
        }

        return ans;
    }

    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
