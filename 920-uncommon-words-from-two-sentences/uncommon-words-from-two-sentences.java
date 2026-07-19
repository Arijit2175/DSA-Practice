class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String[] a = s1.split(" ");
       String[] b = s2.split(" ");
       Map<String, Integer> map = new HashMap<>();
       for(int i = 0; i < a.length; i++) {
        if(map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
        else map.put(a[i], 1);
       } 
       for(int i = 0; i < b.length; i++) {
        if(map.containsKey(b[i])) map.put(b[i], map.get(b[i]) + 1);
        else map.put(b[i], 1);
       }
       List<String> list = new ArrayList<>();
       for(Map.Entry<String, Integer> entry : map.entrySet()) if(entry.getValue() == 1) list.add(entry.getKey());
       return list.toArray(new String[0]);
    }
}