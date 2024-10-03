class Solution {
    public int solution(int a, int b) {
        int add = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int mult = 2 * a * b;
        
        if (add > mult)
            return add;
        return mult;
    }
}