// input : 월(int a), 일(int b)
// variable : 요일(String week), 총 날짜 수(int day)
            // 월 날짜 수(int month), 리턴 요일(String answer)

/* process
월 선언 및 초기화 // 2월만 29일
요일 선언 및 초기화 // 1월 1일이 금요일부터 시작이니 목요일부터 입력

총 날짜 수(day)에 입력받은 일(b) 더하기
총 날짜 수(day) % 7 나머지 값을 인덱스로 요일 구하기   
*/
// 2016. 01. 01 금요일
// 2월만 29 홀수달 31 짝수달 30

// result : 무슨 요일인지

class Solution {
    public String solution(int a, int b) {
        int day = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        for (int i = 1; i < a; i++) {
            day += month[i-1];
        }
        day += b;
        String answer = week[day % 7];
        
        return answer;
    }
}