public class typecast1 {
    public static void main(String[] args){
        byte b=42;
        char c='a';
        short s=1024;
        int i = 500000;
        float f = 5.53f;
        double d= 0.233323;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+ " "+ (i/c)+ " "+ (d-s));
        System.out.println(result);
    }
}
// float* byte= float int/char=int double-short=negative num
// float+int-double=double