import java.util.*;
public class factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num; // to hold num
        int fact=1;//to hold factorial

        System.out.println("enter any positive integer");
        num= in.nextInt();

        for(int i =1; i<=num; i++){
            fact*=i;
        }
        System.out.println("factorial"+fact);

    }
}
