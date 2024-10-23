// 일단 for문 intStrs까지 돌기
// StringBuilder 하나 선언 크기 l
// 다시 for문 l까지 돌기(0부터 시작)
// StringBuilder에 s+j 값 넣기
// for문 끝 StringBuilder의 값 k 보다 큰지 확인

import java.util.*;

class Solution {
    public Integer[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i<intStrs.length; i++) {
            for (int j = 0; j<l; j++) {
                sb.append(intStrs[i].charAt(s+j));
            }    
            if (Integer.valueOf(sb.toString()) > k)
                list.add(Integer.valueOf(sb.toString()));
            sb.delete(0, sb.length());
        }
        
        Integer[] answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}