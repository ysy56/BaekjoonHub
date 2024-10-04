class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m)
                return 1;
            return 0;
        }
        else if (ineq.equals("<") && eq.equals("=")){
            if (n <= m)
                return 1;
            return 0;
        }
        else if (ineq.equals(">")){
            if (n > m)
                return 1;
            return 0;
        }
        else {
            if (n < m)
                return 1;
            return 0;
        }
        
    }
}