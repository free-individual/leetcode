class Solution {
    public boolean isIsomorphic(String s, String t) {
        //hash it?
        // if(s.length() == 1) return true;
        int n[] = new int[256];
        int fl[] = new int[256];
        Arrays.fill(n, -1);
        Arrays.fill(fl, -1);
        // for(int i = 0 ;i < s.length(); i++){
        //     if(s.charAt(i) != t.charAt(i) && n[t.charAt(i)] != s.charAt(i)){
        //         if(n[t.charAt(i)] == -1 && fl[s.charAt(i)] == -1){
        //             n[t.charAt(i)] = s.charAt(i);
        //             fl[s.charAt(i)] = t.charAt(i);
        //         }
        //         else return false;
        //     } 
        //     else if(s.charAt(i) == t.charAt(i)){
        //         n[t.charAt(i)] = s.charAt(i);
        //         fl[s.charAt(i)] = t.charAt(i);
        //         if(n[t.charAt(i)] != s.charAt(i) || fl[s.charAt(i)] != t.charAt(i)) return false;
        //     }
        // }
        for(int i = 0; i < s.length(); i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(n[chs] != fl[cht]) return false;
            n[chs] = fl[cht] = i;
        }
        return true;
    }
}