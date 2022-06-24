package javaHW1;

public class typesAndOperations {
    public static void main(String[] args) {
        byte b1 = 123;
        short sh1 = -32000;
        int i1 = 2000000001;
        long l1 = 9000000000000000000L;
        float f1 = 3.6546f;

        System.out.println("int + long: " + i1 + l1);
        System.out.println("int - long: " + (i1 - l1));
        System.out.println("long / int: " + (l1 / i1));
        System.out.println("float * int: " + (f1 / i1));
        System.out.println("long % short: " + (l1 % sh1));
        System.out.println("long == float: " + (l1 == f1));
        System.out.println("long != short: " + (l1 != sh1));
        System.out.println("int > short: " + (i1 > sh1));
        System.out.println("int < short: " + (l1 < sh1));
        System.out.println("int++ : " + (i1++));
        System.out.println("int-- : " + (i1--));
        System.out.println("int>>2 : " + (i1 >> 2));
        System.out.println("byte<<<3 : " + (b1 >>> 2));

        System.out.println("Переполнение");
        System.out.println("byte max + 1: " + (Byte.MAX_VALUE + 1));
        System.out.println("float min - 1: " + (Float.MIN_VALUE - 1));
        System.out.println("integer max + 1: " + (Integer.MAX_VALUE + 1));
        System.out.println("integer min - 1: " + (Integer.MIN_VALUE - 1));
        System.out.println("byte min - 1: " + (Byte.MIN_VALUE - 1));

        byte b2 = (byte) (Byte.MAX_VALUE + 5);
        System.out.println(b2);

    }
}
