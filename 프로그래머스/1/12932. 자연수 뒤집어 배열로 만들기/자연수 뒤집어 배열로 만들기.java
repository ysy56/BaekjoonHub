import java.util.*;

class Solution {
    public Long[] solution(long n) {
        ArrayList<Long> tmp = new ArrayList<>();
        
        while (n > 0) {
            tmp.add(n%10);
            n /= 10;
        }
        
        Long[] answer = tmp.toArray(new Long[tmp.size()]);
        
        return answer;
    }
}