class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = 0;
        
        for (int i = 1; i < a; i++) {
            if (i == 2) {
                day += 29;
            }
            else if ((i < 8 && i%2 == 1) || (i >= 8 && i%2 == 0)) {
                day += 31;
            }
            else {
                day += 30;
            }   
        }
        day += b;
        
        String answer = week[day%7];
        
        return answer;
    }
}