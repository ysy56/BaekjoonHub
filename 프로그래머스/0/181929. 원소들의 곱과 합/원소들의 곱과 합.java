class Solution {
    public int solution(int[] num_list) {
        double add = 0;
        double multi = 1;
        
        for (int i = 0; i<num_list.length; i++) {
            add += num_list[i];
            multi *= num_list[i];
        }
        
        if (multi < add*add)
            return 1;
        
        return 0;
    }
}