import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        
        int[] distance = new int[4];
        
        distance[0] = w-x;
        distance[1] = h-y;
        distance[2] = x;
        distance[3] = y;
        
        Arrays.sort(distance);
        System.out.println(distance[0]);
    }
}
