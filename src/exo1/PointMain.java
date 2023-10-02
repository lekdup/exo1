package exo1;

import java.awt.*;

public class PointMain {
    public static void main(String[] args) {
        System.out.println("hello world !");
        //Point p1 = new Point(a= 3, b= 4);
        Point p2 = new Point();

        System.out.println(p2);
        System.out.println();

        int[] t1 = new int[5];
        for (int i = 0; i<t1.length; i++) {
            System.out.println(t1[i]);
        }

        String[] t3 = {"A", "B", "abc"};
        System.out.println(t3[2].length());
        System.out.println(t3);
    }
}
