import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {    
                if (sb.length() > 0) {  // 빈 문자열 추가 방지
                    list.add(sb.toString());
                }
                sb.setLength(0);
                continue;
            }
            sb.append(myString.charAt(i));
        }
        
        if (sb.length() > 0)  // 마지막 문자열 추가
            list.add(sb.toString());
    
        // 배열 변환 및 정렬
        String[] answer = list.toArray(new String[0]); // new String[list.size()] 대신 new String[0] 사용 가능
        Arrays.sort(answer);
        
        return answer;
    }
}
