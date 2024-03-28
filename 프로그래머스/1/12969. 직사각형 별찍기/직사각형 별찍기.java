import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        
        for (int i = 0; i < row; i++) {
            System.out.println("*".repeat(column));
        }
    }
}