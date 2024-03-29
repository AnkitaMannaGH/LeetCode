class Solution {
    public int pivotInteger(int n) {
        int l = 0, r = 0;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j > 0; j--) 
                l += j;
            for (int s = i; s <= n; s++) 
                r += s;
            if (l == r) 
                return i;
            l = 0;
            r = 0;
        }
        return -1;
    }
}