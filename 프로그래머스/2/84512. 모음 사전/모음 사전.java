// a~aaaaa 5개

// aaaa(e~u)4개 * (Null + a~u)6개 = 24개

// aaa(e~u)4개 * (Null + a~u)6개 = 24개
// aaa(e~u)4개 * (e~u)4개 * (Null + a~u)6개 = 

class Solution {
	
    static int idx = 0;
    static int answer = -1;
	
    public int solution(String word) {   	
        dfs(word, "");        
        return answer;
    }
    
    public void dfs(String word, String text) {
    	if(answer > 0) return;
    	if(word.equals(text)) {
    		answer=idx;
    	}
    	idx++;
    	if(text.length()==5) {    		
    		return;
    	}
    	
    	dfs(word, text+"A");
    	dfs(word, text+"E");
    	dfs(word, text+"I");
    	dfs(word, text+"O");
    	dfs(word, text+"U");
    }

}