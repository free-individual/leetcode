class Solution {
    public String reverseWords(String s) {
        String s1 = "";
        for(int i = s.length() - 1; i >= 0; i--){
            StringBuilder sb = new StringBuilder();
            while(i >= 0 && s.charAt(i) == ' ') i--;
            while(i >= 0 && s.charAt(i) != ' ') {sb.append(s.charAt(i)); i--;}
            if(s1.length() >= 1) s1 += ' ';
            s1 += sb.reverse().toString();
        }
        if(s1.charAt(s1.length() - 1) == ' ') return s1.substring(0, s1.length() - 1);
        return s1;
    }
}