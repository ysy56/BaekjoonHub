import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		if (s.isEmpty()) {
            System.out.println("0");
            return;
        }
		String[] st = s.split("\\s");
		int word = st.length;
		System.out.println(Integer.toString(word));
	}
}
