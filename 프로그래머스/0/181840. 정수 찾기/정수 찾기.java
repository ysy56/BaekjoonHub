import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        
        for (int i = 0; i<num_list.length; i++) {
            if (num_list[i] > n)
                break;
            if (num_list[i] == n) {
                return 1;
            }
        }
        return 0;
    }
}