import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // 키보드 입력을 받기 위한 Scanner 객체 생성
    int N = scanner.nextInt();
    String sNum = scanner.next(); // 문자열 입력 받기
    char[] cNum = sNum.toCharArray();
    int sum = 0;

    for (int i = 0; i < N; i++){
      sum += cNum[i] - '0';
    } 

    System.out.print(sum);
    scanner.close(); // Scanner 객체 닫기
  }
}