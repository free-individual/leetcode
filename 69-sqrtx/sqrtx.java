class Solution {
    public int mySqrt(int x) {
        return sqrt(x / 2, x);
    }
    public int sqrt(long num, int x){
        long sq = num * num;
        if(sq == x || (sq < x && (num + 1) * (num + 1) > x)) return (int)num;
        else if(sq < x) return sqrt(num + 1, x);
        else return sqrt(num / 2, x);
    }
}