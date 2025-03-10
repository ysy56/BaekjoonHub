import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int k) {
        Integer[] answer = new Integer[k];
        int idx = 0;
        
        for (int i = 0; i<arr.length; i++) {
            if (idx >= k)
                break;
            else if (!Arrays.asList(answer).contains(arr[i])){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        for (int i = idx; i<k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}

