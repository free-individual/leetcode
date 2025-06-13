class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // HashMap<Character, Integer> hm = new HashMap<>();
        int hm[] = new int[26];
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < p.length(); i++){
            hm[p.charAt(i) - 'a']++;
        }
        int n = s.length();
        int m = p.length();
        for(int i = 0; i <= n - m; i++){
            int h[] = new int[26];
            for(int j = i; j < i + m; j++) 
                h[s.charAt(j) - 'a']++;

            int k;
            for(k = 0; k < m; k++){
                if(h[p.charAt(k) - 'a'] != hm[p.charAt(k) - 'a']) break; 
            }
            if(k == m) l.add(i);
        }
        return l;
    }
}