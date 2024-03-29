class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new LinkedList<>();
        HashSet<Integer> winner = new HashSet<>();
        ConcurrentHashMap<Integer,Integer> loser = new ConcurrentHashMap<>();

        for (int[] n : matches)
        {
            winner.add(n[0]);
        }
        for (int[] n : matches)
        {
            if (winner.contains(n[1])) winner.remove(n[1]);
            loser.put(n[1] , loser.getOrDefault(n[1] , 0) + 1);
        }

        Iterator<Integer> iterator = winner.iterator();
        LinkedList<Integer> list1 = new LinkedList<>();

        while (iterator.hasNext())
        {
            list1.add(iterator.next());
        }
         Collections.sort(list1);
          result.add(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        for (Map.Entry<Integer , Integer> map : loser.entrySet())
        {
            if (map.getValue() == 1) list2.add(map.getKey());
        }
           Collections.sort(list2);
            result.add(list2);

        return result;
    }
}