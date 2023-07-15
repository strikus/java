import java.util.Scanner;

public class int_input {
    public static void main(String[] args){

        System.out.println("PLEASE input your roll no");
        Scanner input= new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll no is "+ rollno);
        int a = 10;
        // literals 10 is literal sytaxtically reperstion of var a
        // a is identifiers name of = //variable method class interface na
        int B=234_00_0034;
        String name=input.next();
        System.out.println(name);

        float marks =input.nextFloat();
        System.out.println(marks);

    }
}
