class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int [] wrds = new int[words.length];
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String wrd = words[i].toLowerCase();
            if(r1.contains(""+wrd.charAt(0))){
                int k = 0;
                while(k < wrd.length() && r1.contains(""+wrd.charAt(k))) k++;
                if(k == wrd.length()) {wrds[i] = 1;count++;}
            }
            else if(r2.contains(""+wrd.charAt(0))){
                int k = 0;
                while(k < wrd.length() && r2.contains(""+wrd.charAt(k))) k++;
                if(k == wrd.length()) {wrds[i] = 1;count++;}
            }
            else if(r3.contains(""+wrd.charAt(0))){
                int k = 0;
                while(k < wrd.length() && r3.contains(""+wrd.charAt(k))) k++;
                if(k == wrd.length()) {wrds[i] = 1;count++;}
            }
        }
        String [] ans = new String[count];
        int k = 0;
        for(int i = 0; i < wrds.length; i++){
            if(wrds[i] == 1){
                ans[k] = words[i];
                k++;
            }
        }
        return ans;
    }
}