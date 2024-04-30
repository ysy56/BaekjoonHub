class Solution {
    public double solution(int[] numbers) {
        int size = numbers.length;
        double answer = 0;
        for (int number : numbers)
            answer += number;
        answer /= size;
        return answer;
    }
}