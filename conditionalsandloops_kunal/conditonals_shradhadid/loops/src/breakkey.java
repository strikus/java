import java.util.Scanner;

public class breakkey {
    // print till not a number is multiiple of 10
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do{
            int n = in.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }
        while (true);
    }
}
