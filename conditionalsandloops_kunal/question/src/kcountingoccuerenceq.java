public class kcountingoccuerenceq {
    public static void main(String[] args) {
        // 1 3 8 5 7 5 7 8 7 9
        // how many time a number occured
        // deal with individul digit cheeck ind digits
        // convert to string or take reminder by 10
        // n%10= last digit
        // n/10=new number removed last diggit
        int n =455536;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
