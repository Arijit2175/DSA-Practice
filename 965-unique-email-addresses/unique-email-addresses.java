class Solution {
    public int numUniqueEmails(String[] emails) {
       Set<String> set = new HashSet<>();
       for(int i = 0; i < emails.length; i++) {
        String[] parts = emails[i].split("@");
        String local = parts[0];
        String domain = parts[1];
        StringBuilder sb = new StringBuilder();
       for(int j = 0; j < local.length(); j++) {
        char ch = local.charAt(j);
        if (ch == '.') continue;
        else if (ch == '+') break;
        else sb.append(ch);
       }
       sb.append('@');
       sb.append(domain);
       set.add(sb.toString());
       }
       return set.size();
    }
}