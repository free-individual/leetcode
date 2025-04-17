class Solution {
    public int mySqrt(int x) {
        return sqrt(0, x, x);
    }
    public int sqrt(long start, long end, int x){
        long mid = (start + end) / 2; 
        long sq = mid * mid;
        if(sq == x || (sq < x && (mid + 1) * (mid + 1) > x)) return (int)mid;
        else if(sq < x) return sqrt(mid + 1, end, x);
        else return sqrt(start, mid - 1, x);
    }
}