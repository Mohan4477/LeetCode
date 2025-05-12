class Solution {
    public int fib(int n) {
        if (n<=1) return n;
        int first = 0;
        int sec = 1;
        int res = 0;
        for (int i=2;i<=n;i++) {
            res = sec + first;
            first = sec;
            sec = res;            
        }
        return res;
    }
}