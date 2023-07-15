import java.util.Scanner;

public class leapyearrr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if (((year%4)==0)&&(year%100!=0 || year%400==0)) {
            System.out.println("year leap "+ year);
        }



        else{
            System.out.println(year +"not a leap year");
        }
    }
}
// boolean x =(year%4)==0; boolean y =(year%100)!=0; boolean z = ((year%100==0) && (year%400==0));
// x&& (y||z)
// year exactly divisble by 4
// if centurty  if it prefectly divisible by 400
// year%4==0 && (year %100!==0 || year %400==0)