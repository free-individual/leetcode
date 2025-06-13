class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = 0;
        int n2 = 0;
        StringBuilder sb = new StringBuilder();
        while(n1 < word1.length() && n2 < word2.length()){
            sb.append(word1.charAt(n1));
            sb.append(word2.charAt(n2));
            n1++;
            n2++;
        }
        if(n1 < word1.length()){
            sb.append(word1.substring(n1, word1.length()));
        }
        else if(n2 < word2.length()){
            sb.append(word2.substring(n2, word2.length()));
        }
        return sb.toString();
    }
}