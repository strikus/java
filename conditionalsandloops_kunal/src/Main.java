public class Main {
    public static void main(String[] args) {

        /*
        Syntax of if statement
         if(boolean expression T or F)
         { //body
         }
         else
                {
                        // do this
                }
         */
//        int salary=23330;
//        if(salary>10000)
//        {
//            salary = salary+2000;
//        }
//        else{
//            salary=salary+1000;
//        }

        int salary=23000;

        //multiple if elsse
        if(salary>10000){
            salary+=2000;
        } else if (salary>20000) {
            salary+=3000;

        }

        else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}