package one.dio.basecamp;

public class Main {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //downcasting perda de informação

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000L;
        i2 = (int) l2; //downcasting

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // downcasting sem perda de informação

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcasting

        float f2;
        float f3;
        double d2 = 10000.58d; // downcasting sem perda de informação
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888;
        f3 = (float) d3; // downcasting com perda de informação

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // downcasting com perda de informação

        byte b2;
        b2 = (byte) d3; // downcasting com perda de informação

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);
        System.out.println("b2:" + b2);

        int i5=3;
        int i6 = 10 - 5 * 2 + --i5;

        System.out.println(i6);
    }
}
