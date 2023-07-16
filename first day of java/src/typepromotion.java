public class typepromotion {
    public static void main(String[] args)
    {
        char a='a';
        char b='b';
        char c = (char) (a-b);
        System.out.println((int)(a-b)); //-1
        System.out.println((int)(a)); //97  without a is a
        System.out.println(b);//b
        System.out.println(c);// char
//        short a =5;
//        byte b =125;
//        char c ='c';
//        byte bt = (byte)(a+b+c);
//        System.out.println(bt);
    }
}
