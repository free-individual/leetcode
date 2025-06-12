class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1) return 1;
        int count = 0;
        int i = s.length() - 1;
        while(s.charAt(i) == ' ') i--;
        while(i >= 0 && ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'))){
            i--;
            count++;
        }
        return count;
    }
}