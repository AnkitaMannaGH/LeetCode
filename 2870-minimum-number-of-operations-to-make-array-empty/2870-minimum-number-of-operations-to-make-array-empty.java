class Solution {
    public int minOperations(int[] nums) {
         Map<Integer,Integer> nm=new HashMap<>();
        for(int i:nums)
        {
            nm.put(i, nm.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:nm.keySet())
        {
            if(nm.get(i)==1)
            {
                return -1;
            }
            int size=nm.get(i);
            ans=ans+(size/3)+(size % 3 != 0 ? 1 : 0);
        }
        return ans;
    }
}