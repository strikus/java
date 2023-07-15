import java.util.*;
public class sumofoddandevenintgers
{
    public static void main(String[] args)
    {

       Scanner in = new Scanner(System.in);
        int number;

        int choice;
        int evenSum=0;
        int oddSum=0;

        do {
            System.out.println("enter number");
            number= in.nextInt();

            if(number%2==0){
                evenSum +=number;
            }
            else {
                oddSum =oddSum+number;
            }
            System.out.println("do you want to continue press 1 for yes or 0 for no");

            choice = in.nextInt();

        }
        while (choice==1);
        {
            System.out.println("sum of even" + evenSum);
            System.out.println("odd sum" + oddSum);
        }

    }
}
