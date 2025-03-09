import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int idx = 0;
        
        for (int i = 0; i<arr.length; i++) {
            if (stk.isEmpty()) 
                stk.add(arr[i]);
            
            else if (!stk.isEmpty() && stk.get(stk.size()-1) == arr[i])
                stk.remove(stk.size()-1);
            
            else if (!stk.isEmpty() && stk.get(stk.size()-1) != arr[i])
                stk.add(arr[i]);
        }
        
        if (stk.isEmpty())
            stk.add(-1);
        
        Integer[] answer = stk.toArray(new Integer[0]);
        
        return answer;
    }
}