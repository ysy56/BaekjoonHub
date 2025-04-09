class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<str_list.length; i++) {
            String str = str_list[i];
            if (!str.contains(ex))
                sb.append(str);
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}