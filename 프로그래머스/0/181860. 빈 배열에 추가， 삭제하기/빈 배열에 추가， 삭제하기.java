import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i<arr.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            }
            else {
                for (int j = 0; j<arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        Integer[] answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}