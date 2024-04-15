// input : 오늘 날짜[today], 
        // 약관 유효기간[terms], 
        // 개인정보 수집일자 약관 종류[privacies]
// 단, 1달은 28일 

/* process
today split
term split
privacies split

privacies 반복문
    privacies 날짜 split
    유효기간 구하기
    유효기간 넘는지 구하기
*/

// return : 파기해야 할 개인정보 번호 배열(오름차순)

import java.util.*;

class Solution {
    public String[][] arrSplit(String[] arr) {
        int size = arr.length;
        String[][] arrSplit = new String[size][2];
        
        for (int i = 0; i < size; i++) {
            arrSplit[i] = arr[i].split(" ");
        }
        
        return arrSplit;
    }
    
    public String[] findDeadline(String[] day, String[][] termsArr, int termSize) {
        int month = 0;
        String[] tempDay = day[0].split("\\.");
        
        for (int i = 0; i < termSize; i++) {
            if (day[1].equals(termsArr[i][0])){
                month = Integer.parseInt(termsArr[i][1]);
            }
        }
        
        
        tempDay[1] = Integer.toString(Integer.parseInt(tempDay[1]) + month);
        while (Integer.parseInt(tempDay[1]) > 12) {
            tempDay[0] = Integer.toString(Integer.parseInt(tempDay[0]) + 1);
            tempDay[1] = Integer.toString(Integer.parseInt(tempDay[1]) - 12);
        }
        
        return tempDay;
    }
    
    public boolean checkDeadline(String[] today, String[] deadline) {
        if (Integer.parseInt(today[0]) > Integer.parseInt(deadline[0]))
            return true;
        else if (Integer.parseInt(today[0]) == Integer.parseInt(deadline[0])
                && Integer.parseInt(today[1]) > Integer.parseInt(deadline[1]))
            return true;
        else if (Integer.parseInt(today[0]) == Integer.parseInt(deadline[0])
                && Integer.parseInt(today[1]) == Integer.parseInt(deadline[1])
                && Integer.parseInt(today[2]) >= Integer.parseInt(deadline[2]))
            return true;
        return false;
    }
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        int privSize = privacies.length;
        int termSize = terms.length;
        int[] temp = new int[privSize];
        String[] todayArr = today.split("\\.");
        String[][] termsArr = new String[termSize][2];
        String[][] privArr = new String[privSize][2];
        
        termsArr = arrSplit(terms);
        privArr = arrSplit(privacies);
        

        for (int i = 0; i < privSize; i++) {
            String[] deadline = findDeadline(privArr[i], termsArr, termSize);
            if(checkDeadline(todayArr, deadline)){
                temp[i] = i+1;
                
            }
        }

        int size = 0;
        for (int i = 0; i < privSize; i++) {
            if (temp[i] != 0)
                size++;
        }
        
        
        int idx = 0;
        int[] answer = new int[size];
        for (int i = 0; i < privSize; i++) {
            if (temp[i] != 0) {
                answer[idx] = temp[i];
                idx++;
            }
        }

        return answer;
    }
}