import java.util.*;

class Solution {
    public String solution(int[] food) {
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        list.add("0");
        for (int i = food.length-1; i>0; i--) {
            int batchFood = food[i] / 2;
            for (int j = 0; j<batchFood; j++) {
                list.addFirst(Integer.toString(i));
                list.addLast(Integer.toString(i));
            }
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}