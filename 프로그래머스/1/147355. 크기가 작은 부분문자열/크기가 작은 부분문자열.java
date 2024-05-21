class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pNumber = Long.parseLong(p);
        int loop = t.length()-pLength;
            
        for (int i = 0; i<=loop; i++) {
            long tNumber = Long.parseLong(t.substring(i, i+pLength));
            if (tNumber <= pNumber)
                answer++;
        }
        
        return answer;
    }
}