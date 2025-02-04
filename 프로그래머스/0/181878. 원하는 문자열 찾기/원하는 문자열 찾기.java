class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.length() < pat.length())
            return 0;
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) { // 안전한 범위 설정
            int idx = 0;
            while (idx < pat.length() && myString.charAt(i + idx) == pat.charAt(idx)) {
                idx++;
            }
            if (idx == pat.length()) {
                return 1;
            }
        }
        
        return 0;
    }
}
