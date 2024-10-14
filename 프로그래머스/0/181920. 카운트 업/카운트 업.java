import java.util.*;

class Solution {
    public Integer[] solution(int start_num, int end_num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (Integer i = start_num; i<= end_num; i++) {
            list.add(i);
        }
        
        Integer[] answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
}