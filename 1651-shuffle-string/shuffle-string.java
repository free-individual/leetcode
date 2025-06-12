class Solution {
    public int indexOf(int n, int[] nd){
        for(int i = 0; i < nd.length; i++){
            if(n == nd[i]) return i;
        }
        return -1;
    }
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for(int i = 0; i < indices.length; i++){
            ans += s.charAt(indexOf(i, indices));
        }
        return ans;
    }
}