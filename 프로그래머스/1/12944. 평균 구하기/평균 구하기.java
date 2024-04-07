// input : -10,000이상 10,000이하의 값을 가지는 배열(arr)
// variable : 배열의 크기(size : int), 배열 요소의 총합(answer : double)

// 배열의 크기 구하기
// 배열의 크기만큼 반복문
    // answer += 배열의 각 요소
// answer /= size

// return : 배열에 담긴 각 요소의 평균값

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int size = arr.length;
        
        for (int i = 0; i < size; i++) 
            answer += arr[i];
        answer /= size;
        
        return answer;
    }
}