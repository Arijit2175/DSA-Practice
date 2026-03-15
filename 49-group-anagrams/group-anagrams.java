class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash =new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!hash.containsKey(key)){
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}