class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int my_last_idx = my_string.length() - 1;
        int is_last_idx = is_suffix.length() - 1;
        

        if (my_string.contains(is_suffix)) {
            answer = 1;
            
            for (int i = 0; i<is_suffix.length(); i++) {
                if (my_string.charAt(my_last_idx - i) != is_suffix.charAt(is_last_idx - i)) {
                    answer = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}