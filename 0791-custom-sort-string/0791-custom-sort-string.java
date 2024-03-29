class Solution {
    public String customSortString(String S, String T) {
        ArrayList<Integer> numOfChars = new ArrayList<Integer>();
        for(int i = 0; i < S.length(); i++) {
            numOfChars.add(i, 0);
        }
        
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }
        
        String output = "";
        
        for(int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            Integer index = map.get(c);
            
            if (index == null) {
               output += c; 
            } else {
                int num = numOfChars.get(index);
                numOfChars.set(index, ++num);
            }
        }
        
        for(int i = 0; i < numOfChars.size(); i++) {
            int num = numOfChars.get(i).intValue();
            while(num > 0) {
                num--;
                output += S.charAt(i);
            }
        }
        
        return output;
    }
}