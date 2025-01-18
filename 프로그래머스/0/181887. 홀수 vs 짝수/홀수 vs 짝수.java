class Solution {
    public int solution(int[] num_list) {
        int odd = 0; // 홀수
        int even = 0; // 짝수
        
        for (int i = 0; i<num_list.length; i++) {
            if ((i+1) % 2 == 0)
                even += num_list[i];
            else
                odd += num_list[i];
        }
        
        if (odd > even)
            return odd;
        
        return even;
    }
}