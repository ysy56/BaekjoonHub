import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(new int[]{rank[i], i});
            }
        }
        
        // rank 기준 오름차순 정렬
        list.sort(Comparator.comparingInt(a -> a[0]));
        
        int answer = 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];
        
        return answer;
    }
}
