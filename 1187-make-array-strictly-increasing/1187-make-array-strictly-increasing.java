class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) { // A = arr1, B = arr2
      TreeSet<Integer> set = new TreeSet<>(Arrays.stream(arr2).boxed().toList());
        int[] dp = new int[arr2.length+1];
        dp[0]=-1;
        int INF = (int)2e9;
        for (int i = 0; i < arr1.length; i++){
            for (int j = arr2.length; j >= 0; j--){
                int a = arr1[i] > dp[j]? arr1[i] : INF; // option A - don't swap
                Integer b = set.higher(j==0?INF:dp[j-1]); // option B - swap
                dp[j]=Math.min(a, b==null?INF:b); // take the min of A and B
            }
        }
        for (int i = 0; i <= arr2.length; i++) if (dp[i] != INF){
            return i;
        }
        return -1;  
    }
}