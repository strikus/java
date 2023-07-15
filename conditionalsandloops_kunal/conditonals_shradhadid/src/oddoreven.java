import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("entered number is even" + a);

        } else {
            System.out.println("a and  is odd");

        }
        if (b % 2 == 0) {
            System.out.println("entered no of b is even" + b);
        } else {
            System.out.println("b is odd");

        }
    }
}
