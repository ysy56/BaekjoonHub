class Solution {
    public String solution(String myString, String pat) {
        int maxIdx = 0;
        int patIdx = pat.length()-1;
        
        for (int i = myString.length()-1; i>=0; i--) {
            if (myString.charAt(i) == pat.charAt(patIdx)) 
                patIdx--;
        
            if (patIdx < 0){
                maxIdx = i+pat.length()-1;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<=maxIdx; i++) {
            sb.append(myString.charAt(i));
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}