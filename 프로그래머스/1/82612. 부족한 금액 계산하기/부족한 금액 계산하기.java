class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // 변수 : 놀이기구 금액
        long rides_price = 0;
        
        // count번 탈 경우 놀이기구 금액
        // 놀이기구 금액 = 처음 가격 * 1~count
        for (int i = 1; i <= count; i++) {
            rides_price += price * i;
        }
        // answer = 놀이기구 금액 - 현재 금액
        answer = rides_price - money;
        
        // 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지 return
        // 단, 금액이 부족하지X 0 reutrn (현재 금액이 놀이기구 금액보다 클 경우)
        if (money > rides_price)
            return 0;
        return answer;
    }
}