class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        queue.offer(beginWord);
        int steps = 1;

        while (!queue.isEmpty()) {
            int qsize = queue.size();
            for (int i = 0; i < qsize; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) return steps;

                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    char org = arr[j]; 

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == org) continue; 
                        arr[j] = c;
                        String newWord = new String(arr);

                        if (set.contains(newWord)) {
                            queue.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    arr[j] = org; 
                }
            }
            steps++;
        }
        return 0;
    }
}