class Solution {
    public int solution(int a, int b) {
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.valueOf(s1) > Integer.valueOf(s2))
            return Integer.valueOf(s1);
        
        return Integer.valueOf(s2);
    }
}