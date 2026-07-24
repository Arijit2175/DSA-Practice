class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int res = 0;
        for(int i = 0; i < operations.length; i++) {
            if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")) list.add(Integer.parseInt(operations[i]));
            else if(operations[i].equals("C")) list.remove(list.size() - 1);
            else if(operations[i].equals("D")) list.add(list.get(list.size() - 1) * 2);
            else {
                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);
                list.add(last + secondLast);
            }
        }
        for(int i = 0; i < list.size(); i++) res += list.get(i);
        return res;
    }
}