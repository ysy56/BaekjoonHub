import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        int pow = 1;
        
        while(pow < arr.length) {
            pow *= 2;
        }
        
        for (int i = arr.length; i<pow; i++) {
            list.add(0);
        }
        
        Integer[] answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}