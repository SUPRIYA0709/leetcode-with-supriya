// Last updated: 13/08/2026, 15:51:26
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1){
            return s;
        }
        int p=n/2;
        return(long)s+(p*(long)(m-1))+1;
    }
}