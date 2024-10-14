// Tip 5를 더하기
import java.util.*;

class Solution {
    public Integer[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (Integer i = l; i<=r; i++) {
            String tmp = String.valueOf(i);
            boolean check = true;
            
            for (Integer j = 0; j<tmp.length(); j++) {
                if (tmp.charAt(j) != '0' && tmp.charAt(j) != '5') {
                    check = false;
                    break;
                }
            }
            
            if (check == true) {
                list.add(i);
            }
            
        }
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        Integer[] answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
}