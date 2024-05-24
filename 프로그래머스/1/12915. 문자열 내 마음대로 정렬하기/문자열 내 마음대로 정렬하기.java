class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
                else if (strings[i].charAt(n) == strings[j].charAt(n) 
                         && strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            } 
        }
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }
        
        return answer;
    }
}