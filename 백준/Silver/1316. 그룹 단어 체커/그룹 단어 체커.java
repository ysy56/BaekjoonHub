import java.util.*;

public class Main {
  public static boolean checkWord(String word) {
    int len = word.length();
    char[] check = new char[100];

    check[0] = word.charAt(0);
    int checkIdx = 1;
    
    for (int i = 1; i < len; i++) {
      if (word.charAt(i) != word.charAt(i-1)){
        check[checkIdx] = word.charAt(i);
        checkIdx++;
      }
    }

    for (int i = 0; i < checkIdx-1; i++) {
      for (int j = i+1; j < checkIdx; j++) {
        if (check[i] == check[j])
          return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    int N = 0;
    int wordNum = 0;
    
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    sc.nextLine();
    
    for (int i = 0; i < N; i++) {
      String word = sc.nextLine();
      if (checkWord(word)){
        wordNum++;
      }
    }
    System.out.println(wordNum);
    sc.close();
  }
}