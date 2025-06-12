class Solution {
    public boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z') return true;
        if(ch >= 'A' && ch <= 'Z') return true;
        if(ch >= '0' && ch <= '9') return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int k = 0;
        String tmp = "";
        for(int i = 0; i < s.length(); i++){
            if(isAlphaNumeric(s.charAt(i)))
                tmp += s.charAt(i);
        }
        s = tmp;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        } 
        return true;
    }
}