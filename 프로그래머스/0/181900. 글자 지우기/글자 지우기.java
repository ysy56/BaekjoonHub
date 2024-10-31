import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int arr_idx = 0;
        
        Arrays.sort(indices);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (arr_idx < indices.length && i == indices[arr_idx]) {
                arr_idx++;
                continue;
            }
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}
