import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0 ;i<my_string.length(); i++) {
            if (my_string.charAt(i) == ' ') {
                if (sb.length() != 0)
                    list.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }
        if (sb.length() != 0)
            list.add(sb.toString());
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}