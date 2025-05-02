class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<picture.length; i++) {
            for (int j = 0; j<picture[i].length(); j++) {
                for (int l = 0; l<k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for (int l = 0; l<k; l++) {
                answer[i*k+l] = sb.toString();
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}