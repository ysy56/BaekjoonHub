import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = s.length()-1; i>=0; i--) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}