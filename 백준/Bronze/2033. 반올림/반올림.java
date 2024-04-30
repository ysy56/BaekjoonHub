import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=1;
        int num=n;
        while(n>9){
            int a=n%10;
            if(a>=5){
                num+=(10-a)*t;
                n+=10;
            }
            else{
                num-=a*t;
            }
            t*=10;
            n/=10;
        }
        System.out.print(num);
    }
}