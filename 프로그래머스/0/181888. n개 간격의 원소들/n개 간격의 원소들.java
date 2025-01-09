class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n; // 정확한 크기 계산
        int[] answer = new int[size];
        
        int currentIndex = 0; // 변수명 변경
        for (int i = 0; i < size; i++) {
            if (currentIndex < num_list.length) { // 경계 조건 확인
                answer[i] = num_list[currentIndex];
            }
            currentIndex += n;
        }
        
        return answer;
    }
}
