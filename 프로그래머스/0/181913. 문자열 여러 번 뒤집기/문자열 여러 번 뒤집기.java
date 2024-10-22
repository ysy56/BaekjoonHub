class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] temp = new char[my_string.length()];
        
        for (int i = 0; i<my_string.length(); i++) {
            temp[i] = my_string.charAt(i);
        }
        
        for (int i = 0; i<queries.length; i++) {
            for (int j = 0; j<(queries[i][1] - queries[i][0])/2 + 1; j++) {
                char c = temp[queries[i][0] + j];
                temp[queries[i][0] + j] = temp[queries[i][1] - j];
                temp[queries[i][1] - j] = c;
            }
        }
        
        String answer = String.valueOf(temp);
        
        return answer;
    }
}