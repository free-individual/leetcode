class Solution {
    public boolean checkIfPangram(String sentence) {
        int let[] = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            let[sentence.charAt(i) - 'a']++;
        }
        for(int i = 0; i < let.length; i++){
            if(let[i] < 1) return false;
        }
        return true;
    }
}