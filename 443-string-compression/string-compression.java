class Solution {
    public int compress(char[] chars) {
        String s= "";
        for(int  i = 0; i < chars.length; i++){
            int count = 1;
            int j = i + 1;
            char ch = chars[i];
            while(j < chars.length && chars[j] == ch) {j++;count++;}
            s+=ch;
            if(count > 1){
                s += count;
            }
            i = j - 1;
        }
        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}