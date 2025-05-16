class Solution {
    public boolean isBalanced(String num) {
        int evensum = 0;
        int oddsum = 0;
        int i=0;

        while (i < num.length()) {
            char ch = num.charAt(i);
            if ( i % 2 == 0) {    
                evensum += ch - '0';
            }
            else {
                oddsum += ch - '0';
            }
            i++;
        }
        return evensum == oddsum;
    }
}