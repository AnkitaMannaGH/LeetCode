class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, t = n / 4;
        for (int i = 0; i < n - t; i++) {
		  if (arr[i] == arr[i + t]) {
			return arr[i];
		}
	}
	return -1;
    }
}