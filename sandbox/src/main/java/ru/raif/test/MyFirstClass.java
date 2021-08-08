package ru.raif.test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyFirstClass {

    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(4,6);
        System.out.println("Расстояние между двумя точками = " + (p1.distance((p2))));
    }
}