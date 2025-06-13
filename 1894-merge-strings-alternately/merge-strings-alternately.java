class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = 0;
        StringBuilder sb = new StringBuilder();
        while(n1 < word1.length() && n1 < word2.length()){
            sb.append(word1.charAt(n1));
            sb.append(word2.charAt(n1));
            n1++;
        }
        if(n1 < word1.length()){
            sb.append(word1.substring(n1, word1.length()));
        }
        else if(n1 < word2.length()){
            sb.append(word2.substring(n1, word2.length()));
        }
        return sb.toString();
    }
}