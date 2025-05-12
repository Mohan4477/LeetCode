class Solution {
    int[] num = new int[46];
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n==1 || n==2) return 1;

        if(num[n] != 0) return num[n];

        num[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);

        return num[n];
    }
}