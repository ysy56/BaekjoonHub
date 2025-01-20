class Solution {
    public String[] solution(String[] names) {
        int groupCount = (names.length / 5);
        if (names.length % 5 != 0)
            groupCount++; 
        String[] answer = new String[groupCount];
        
        for(int i = 0; i<groupCount; i++) {
            answer[i] = names[i*5];
        }
        
        return answer;
    }
}