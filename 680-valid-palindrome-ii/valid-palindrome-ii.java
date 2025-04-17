class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < s.length() / 2){
            if(s.charAt(i) != s.charAt(j)){
                if(isBoolean(s.substring(i + 1, j + 1)) || isBoolean(s.substring(i, j))) return true;
                else return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isBoolean(String s){
        System.out.println(s);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        } System.out.println(s);
        return true;
    }
}