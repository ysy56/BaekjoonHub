import java.util.*;

class Solution {
    public Integer[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean check = false;
        
        for (int i = 0; i<num_list.length; i++) {
            if (i+1 == n)
                check = true;
            if (check)
                list.add(num_list[i]);
        }
        
        Integer[] answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}