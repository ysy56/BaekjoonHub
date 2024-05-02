import java.util.Objects;

class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        
        for (String name : seoul) {
            if (Objects.equals(name, "Kim"))
                break;
            idx++;
        }
        
        String answer = "김서방은 " + idx + "에 있다";
        return answer;
    }
}