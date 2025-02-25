import java.util.*;

class Solution {
    public Integer[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        int size = 0;
        for (int i = 0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                list.add(size);
                size = 0;
                continue;
            }
            size++;
        }
        list.add(size);
        
        Integer[] answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
}