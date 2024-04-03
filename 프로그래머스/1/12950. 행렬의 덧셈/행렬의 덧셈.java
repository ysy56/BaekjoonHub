// 입력 : 행과 열의 크기가 같은 2개의 2차원 배열

// row = 가로 column = 세로의 길이 구하기
// answer의 배열 크기 지정 및 초기화

/* 2중 반복문 이용하기
for (column)
    for (row) 
        answer = arr1 + arr2
*/

// result : 입력받은 2차원 배열 2개의 값을 더한 것

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int column = arr1.length;
        int row = arr1[0].length;
        int[][] answer = new int[column][row];
        
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++)
                answer[i][j] = arr1[i][j] + arr2[i][j];
        }
        
        return answer;
    }
}