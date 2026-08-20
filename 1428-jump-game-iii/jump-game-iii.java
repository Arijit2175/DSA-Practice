class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int i = queue.poll();
            if(arr[i] == 0) return true;
            int next1 = i + arr[i];
            if(next1 < arr.length && !visited[next1]) {
                visited[next1] = true;
                queue.add(next1);
            }
            int next2 = i - arr[i];
            if(next2 >= 0 && !visited[next2]) {
                visited[next2] = true;
                queue.add(next2);
            }
        }
        return false;
    }
}