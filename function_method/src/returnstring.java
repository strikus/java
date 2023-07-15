public class returnstring {
    public static void main(String[] args) {
        String sup = greet();

        System.out.println(sup);
        String personalmsg = mygreet("hellp rohiy");
        System.out.println(personalmsg);


        int ans = sum3(20,39);
        System.out.println(ans);

    }
    static String greet(){
        String greeeting = "how are you";
        return greeeting;




}

     static String mygreet(String name) {
        String message = "sdjsd"+name;
        return message;
    }

    // pass the value of number when u calling the method in main()
static int sum3(int a, int b){

        int sum = a+b;
        return sum;
}


}
