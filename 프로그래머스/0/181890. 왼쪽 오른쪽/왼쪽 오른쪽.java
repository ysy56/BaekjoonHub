class Solution {
    public String[] solution(String[] str_list) {
        int len = 0;
        
        for (int i = 0; i<str_list.length; i++) {
            if (str_list[i].equals("r") || str_list[i].equals("l")) {
                len = i;
                break;
            }
        }
        
        // "r"일 경우 오른쪽 배열 반환
        if (str_list[len].equals("r")) {
            String[] answer = new String[str_list.length - len - 1];
            for (int i = len + 1; i < str_list.length; i++) {
                answer[i - len - 1] = str_list[i];
            }
            return answer;
        } 
        // "l"일 경우 왼쪽 배열 반환
        else {
            String[] answer = new String[len];
            for (int i = 0; i < len; i++) {
                answer[i] = str_list[i];
            }
            return answer;
        }
    }
}