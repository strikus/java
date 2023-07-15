import java.util.Scanner;

public class nestedswitch
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in) ;
        int empID =in.nextInt();
        String department = in.next();

        switch (empID)
        {
            case 1 -> System.out.println("rohit");
            case 2 -> System.out.println("rajveeer");
            case 3 ->
            {
                System.out.println("emp nu 3");
                switch (department)
                {
                    case "IT" -> System.out.println("it deparment");
                    case "Management" -> System.out.println("management deparment");
                    default -> System.out.println("no deparment herer");
                }
            }
            default -> System.out.println("enter corret emp ifd");
        }
    }
}

