class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) 
        {
            
            int exchanged = empty/numExchange;
            ans += exchanged;
            empty = empty % numExchange + exchanged; 
        }
        return ans;
    }
}