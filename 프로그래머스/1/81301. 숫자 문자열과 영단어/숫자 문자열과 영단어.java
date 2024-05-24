class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
                temp.setLength(0);
            }
            else {
                temp.append(s.charAt(i));
                
            }
            switch(String.valueOf(temp)) {
                case "zero" -> { sb.append(0);
                                temp.setLength(0); }
                case "one" -> { sb.append(1);
                                temp.setLength(0); }
                case "two" -> { sb.append(2);
                                temp.setLength(0); }
                case "three" -> { sb.append(3);
                                temp.setLength(0); }
                case "four" -> { sb.append(4);
                                temp.setLength(0); }
                case "five" -> { sb.append(5);
                                temp.setLength(0); }
                case "six" -> { sb.append(6);
                               temp.setLength(0); }
                case "seven" -> { sb.append(7);
                                temp.setLength(0); }
                case "eight" -> { sb.append(8);
                                temp.setLength(0); }
                case "nine" -> { sb.append(9);
                                temp.setLength(0); }
            }
        }
        answer = Integer.parseInt(String.valueOf(sb));
        return answer;
    }
}