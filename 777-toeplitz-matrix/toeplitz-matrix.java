class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // if(matrix.length == 1 || matrix[0].length == 1) return true;
        int r = 0;
        int c = matrix[r].length - 1;
        while(c > -1){
            int cr = r;
            int cc = c;
            while(cc < matrix[cr].length - 1 && cr < matrix.length - 1){
                if(matrix[cr][cc] != matrix[cr + 1][cc + 1]) return false;
                cc++;
                cr++;
            }
            c--;
        }
        c = 0;
        r++;
        while(r < matrix.length - 1){
            int cc = c;
            int cr =r;
            while(cr < matrix.length - 1 && cc < matrix[cr].length - 1){
                if(matrix[cr][cc] != matrix[cr + 1][cc + 1]) return false;
                cr++;
                cc++;
            }
            r++;
        }
        return true;
    }
}