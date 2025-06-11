class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int k = 0;
                int  l = 0;
                int flag = 0;
                while(k < matrix.length){
                    if(matrix[i][j] < matrix[k][j]) {
                        flag = 1;
                        break;
                    }
                    k++;
                }
                while(l < matrix[i].length){
                    if(matrix[i][j] > matrix[i][l]){
                        flag = 1;
                        break;
                    }
                    l++;
                }
                if(flag != 1) li.add(matrix[i][j]);
            }
        }
        return li;
    }
}