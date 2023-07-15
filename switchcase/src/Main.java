import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        String fruit =in.next();
//        .equals check  value not refrence as == check refrence too
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("aasdpasdpwapplew");
            case "banana" -> System.out.println("bananananafsff");
            case "grapes" -> System.out.println("grapess s s s");
        }
    }
}
//
/*
case 1,2,3,4,5 -> System.out.println("weekday);
case 6,7 -> System.out.println("weekend);
 */