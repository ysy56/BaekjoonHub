import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<binomial.length(); i++) {
            if (binomial.charAt(i) == ' ') {
                list.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            sb.append(binomial.charAt(i));
        }
        list.add(sb.toString());
        
        switch(list.get(1)) {
            case "+":
                answer = Integer.valueOf(list.get(0)) + Integer.valueOf(list.get(2));
                break;
        
            case "-":
                answer = Integer.valueOf(list.get(0)) - Integer.valueOf(list.get(2));
                break;
                
            default:
                answer = Integer.valueOf(list.get(0)) * Integer.valueOf(list.get(2));
                break;
        }
        
        return answer;
    }
}