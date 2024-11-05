import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        int start_idx = 0;
        int end_idx = arr.length;
        
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 2) {
                start_idx = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i>= 0; i--) {
            if (arr[i] == 2) {
                end_idx = i;
                break;
            }
        }
        
        if ((end_idx - start_idx) == arr.length) {
            int[] empty = {-1};
            return empty;
        }
      
        int[] answer = new int[end_idx - start_idx + 1];
        for (int i = 0; i<= end_idx - start_idx; i++) {
            answer[i] = arr[i+start_idx];
        }
        
        return answer;
    }
}