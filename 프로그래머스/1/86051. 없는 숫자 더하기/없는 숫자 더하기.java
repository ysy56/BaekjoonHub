// input : 0~9까지의 숫자 일부 배열(numbers)
// variable : 없는 수 총합(int: answer)
        // 입력배열의 크기(int: size)
        // 0~9까지의 값이 들어간 확인 배열(int: check)

// answer = 0
// 입력배열의 크기 구하기
// 0~9까지의 값이 들어간 배열 선언

// 입력배열의 크기만큼 반복문(i = 0)
    // 9까지의 반복문(j = 0)
        // 입력 배열[i]와 확인 배열[j]가 맞다면, 확인 배열[j]에 0값 넣기
// 9까지의 반복문(i = 0)
    // answer값에 확인 배열[i] 더한 값 넣기

// return : 입력배열에서 찾을 수 없는 수의 합

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int size = numbers.length;
        int[] check = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < size; i++) {
            for(int j = 0; j <= 9; j++) {
                if (numbers[i] == check[j])
                    check[j] = 0;
            }    
        }
        for(int i = 0; i <= 9; i++) {
            answer += check[i];
        }
        
        return answer;
    }
}