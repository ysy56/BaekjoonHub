class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int[] answer = new int[size];
        
        for (int i = 0; i<size; i++) {
            if (arr[i] >= 50 && arr[i]%2 == 0)
                answer[i] = arr[i]/2;
            else if (arr[i] < 50 && arr[i]%2 == 1)
                answer[i] = arr[i]*2;
            else
                answer[i] = arr[i];
            
        }
        
        return answer;
    }
}