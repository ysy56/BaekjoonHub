import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> group = new HashMap<>();
        
        for (int i = 0; i<strArr.length; i++) {
            int length = strArr[i].length();
            group.put(length, group.getOrDefault(length, 0) + 1);
        }
        
        int answer = 0;
        for (int count : group.values()) {
            if (answer < count)
                answer = count;
        }
        
        return answer;
    }
}