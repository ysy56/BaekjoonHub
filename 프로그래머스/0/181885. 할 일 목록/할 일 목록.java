class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        for (int i = 0; i<finished.length; i++) {
            if (finished[i] == false)
                count++;
        }
        
        int idx = 0;
        String[] answer = new String[count];
        for (int i = 0; i<todo_list.length; i++) {
            if(finished[i] == false) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }
        
        return answer;
    }
}