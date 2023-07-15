import java.util.Scanner;

public class one_to_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int counter = 1;

        while(counter<=num){
            System.out.println(counter);
            counter++;
        }

    }
}
