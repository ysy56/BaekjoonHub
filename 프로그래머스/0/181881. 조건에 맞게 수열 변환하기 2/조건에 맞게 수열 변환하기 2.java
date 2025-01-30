class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean bool = true;
        while (bool) {
            answer++;
            bool = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    bool = true;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    bool = true;
                }
            }
        }
        return answer - 1;
    }
}