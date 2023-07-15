import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b && a>c){
            System.out.println("largest is a");

        }
        if(b>c){
            System.out.println("b is largest");

        }
        else{
            System.out.println("c is largest");

        }
    }


}
