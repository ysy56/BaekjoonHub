import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<myStr.length(); i++) {
            if (myStr.charAt(i) == 'a' 
                || myStr.charAt(i) == 'b' 
                || myStr.charAt(i) == 'c') {
                if (sb.length() > 0){
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
            else
                sb.append(myStr.charAt(i));
        }
        if (sb.length() > 0){
            list.add(sb.toString());
        }
        if (list.size() == 0)
            list.add("EMPTY");
        
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}