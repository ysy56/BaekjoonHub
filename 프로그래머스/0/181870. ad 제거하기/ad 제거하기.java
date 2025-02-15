import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad"))
                result.add(strArr[i]);
        }
        
        String[] answer = result.toArray(new String[result.size()]);
        return answer;
    }
}