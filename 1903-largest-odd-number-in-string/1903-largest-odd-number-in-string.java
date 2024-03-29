class Solution {
    public String largestOddNumber(String num) {
        int size = num.length();
        HashSet<Character> odd = new HashSet<>(Arrays.asList('1', '3', '5', '7', '9'));
        for (int i = size - 1; i >= 0; i--) {
            if (odd.contains(num.charAt(i))) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}