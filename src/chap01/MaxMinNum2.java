package chap01;

public class MaxMinNum2 {

    public static void main(String[] args) {
        System.out.println("max3(7,2,1) " + max3(7, 2, 1));
        System.out.println("max3(3,2,2) " + max3(2, 3, 1));
        System.out.println("max3(3,1,2) " + max3(1, 2, 3));
//        System.out.println("max4(3,1,2,5) " + max4(3, 1, 2,5));
//        System.out.println("max4(2,3,1,6) " + max4(2,3,1,6));
//        System.out.println("max4(7,8,9,10) " + max4(7,8,9,10));
//        System.out.println("min3(3,2,1) " + min3(3,2,1));
//        System.out.println("min3(5,4,3) " + min3(5,4,3));
//        System.out.println("min4(6,5,4,3) " + min4(6,5,4,3));
//        System.out.println("min4(3,4,5,6) " + min4(3,4,5,6));
    }

    private static int max4(int a, int b, int c, int d) {

        int max = a;

        if (b > a)
            max = b;
        if (b > c)
            max = b;
        if (c > d)
            max = c;
        else
            max = d;

        return max;
    }

    static int max3(int a, int b, int c) {

        int max = a;

        if(b > a)
            max = b;
        if(c > b)
            max = c;

        return max;
    }
}
