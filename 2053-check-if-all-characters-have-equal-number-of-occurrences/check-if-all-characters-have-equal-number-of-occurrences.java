class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 0){
                sb.append(s.charAt(i));
            }
            arr[s.charAt(i) - 'a']++;
        }
        s = sb.toString();
        for(int i = 1; i < s.length(); i++){
            if(arr[s.charAt(i - 1) - 'a'] != arr[s.charAt(i) - 'a']) return false;
        }
        return true;
    }
}