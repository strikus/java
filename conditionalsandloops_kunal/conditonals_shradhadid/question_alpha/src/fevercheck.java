import java.util.Scanner;

public class fevercheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double temp = in.nextDouble();

        if(temp>100){
            System.out.println("you have fever");

        }
        else{
            System.out.println("no fever enjoy");

        }
    }
}
