class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int k = 0;
        String ans[] = new String[numRows];
        int  j = 0;
        int dir = 1;
        for(int i = 0; i < ans.length; i++) ans[i] = "";
        for(int i = 0; i < s.length(); i++){
            ans[j] += s.charAt(i);
            if(dir == 1){
                j++;
            }
            if(dir == -1){
                j--;
            }
            if(j == numRows){
                    j-=2;
                    dir = -1;
            }
            if(j == -1) {
                j=1;
                dir = 1;
            }
        }
        String res = "";
        for(int i = 0; i < ans.length; i++){
            res += ans[i];
        }
        return res;
    }
}