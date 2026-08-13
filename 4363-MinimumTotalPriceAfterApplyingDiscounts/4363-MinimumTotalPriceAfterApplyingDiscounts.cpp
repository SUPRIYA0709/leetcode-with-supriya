// Last updated: 13/08/2026, 15:51:21
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
 public:
    double minPrice(vector<int>& prices, vector<int>& discounts){
        sort(prices.begin(), prices.end(), greater<int>());
        sort(discounts.begin(),discounts.end(),greater<int>());

        double ans = 0.0;
        int n = prices.size();
        int m = discounts.size();

        for (int i =0; i < n; i++) {
            int d = (i < m ? discounts[i] : 0);
            ans += prices[i] * (100.0 - d) /100.0;
        }
         return ans;

    }

};