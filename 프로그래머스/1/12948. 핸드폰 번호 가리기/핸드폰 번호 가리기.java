class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // 변수 : 전화번호 길이
        int phone_len = phone_number.length();
        
        // process
        // answer에 전화번호 길이 - 4만큼 * 추가
        // answer에 앞의 과정 이후 나머지 숫자 추가
        answer = "*".repeat(phone_len - 4);
        answer += phone_number.substring(phone_len - 4);
        
        // return : 전화번호의 뒷 4자리 제외한 나머지 숫자 *
        return answer;
    }
}