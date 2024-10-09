class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        for (int i = 0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
                even *= 10;
            }
            else {
                odd += num_list[i];
                odd *= 10;
            }
        }
        
        even /= 10;
        odd /= 10;
        
        int answer = even + odd;
        
        return answer;
    }
}