class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i<queries.length; i++) {
            int temp = -1;
            
            for (int j = queries[i][0]; j<=queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (temp == -1)
                        temp = arr[j];
                    else if (temp > arr[j])
                        temp = arr[j];
                } 
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}