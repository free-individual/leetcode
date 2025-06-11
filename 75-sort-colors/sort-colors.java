class Solution {
    public void sortColors(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while(j <= k){
            if(arr[j] == 0){
                arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                i++;
                j++;
            }
            else if(arr[j] == 2){
                if(arr[k] == 2){
                    while(k > j && arr[k] == 2) k--; 
                    if(k <= j) break;
                }
                arr[k] = arr[k] + arr[j] - (arr[j] = arr[k]);
                k--;
            }
            else j++;
        }
    }
}