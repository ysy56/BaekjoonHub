class Solution {
    public int solution(String number) {
        int num = 0;
        String[] list = number.split("");
        
        for (int i = 0; i < list.length; i++) {
            num += Integer.valueOf(list[i]);
        }
        
        int answer = num % 9;
        
        return answer;
    }
}