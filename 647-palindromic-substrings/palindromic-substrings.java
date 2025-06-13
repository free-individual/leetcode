class Solution {
    public boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 0;
        // for(int i = 0; i < s.length(); i++){
        //     for(int j = i + 1; j <= s.length(); j++){
        //         if(isPalindrome(s.substring(i, j))){
        //             count++;
        //         }
        //     }
        // }

        count = 0;
        for(int i = 0; i < s.length(); i++){
            int l = i;
            int h = i;
            while(l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)){
                count++;
                l--;
                h++;
            }
            h = i+1;
            if(h < s.length() && s.charAt(i) == s.charAt(h)){
                count++;
                int z = i - 1;
                int r = i + 2;
                while(z >= 0 && r < s.length() && s.charAt(z) == s.charAt(r)){
                    count++;
                    z--;
                    r++;
                }
            }
        }
        return count;
    }
}