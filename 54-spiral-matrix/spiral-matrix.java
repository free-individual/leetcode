class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int fr = 0, fc = 0;
        int n = matrix.length, m = matrix[0].length;
        int lr = n - 1, lc = m - 1;
        while(lr >= fr && fc <= lc){
            for(int i = fc; i <= lc; i++){
                l.add(matrix[fr][i]);
            }
            fr++;
            for(int i = fr; i <= lr; i++){
                l.add(matrix[i][lc]);
            }
            lc--;
            if(lr >= fr){
                for(int i = lc; i >= fc; i--){
                    l.add(matrix[lr][i]);
                }
                lr--;
            }
            if(lc >= fc){
                for(int i = lr; i >= fr; i--){
                    l.add(matrix[i][fc]);
                }
                fc++;
            }
        }
        return l;
    }
}