class Solution {
    public int arrangeCoins(int n) {
        long Double=n * 2L;
        int sqrt=(int)Math.sqrt(Double);
        return 1L*sqrt*sqrt+sqrt <= Double ? sqrt:sqrt-1;
    }
}