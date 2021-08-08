package ru.raif.test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyFirstClass {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 5;
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 7;
        System.out.println("Расстояние между двумя точками = " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}