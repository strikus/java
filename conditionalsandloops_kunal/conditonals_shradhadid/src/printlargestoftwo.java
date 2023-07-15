import java.util.Scanner;

public class printlargestoftwo {
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b= in.nextInt();

                if(a>b) {
                    System.out.println("a is ;argest");
                }
                    if(a==b)
                    {
                        System.out.println("both eaual");

                    }

                else{
                    System.out.println("b is largest");

                }
    }
}
