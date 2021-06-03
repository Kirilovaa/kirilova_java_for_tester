package ru.stqa.rft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    Point start = new Point(2,3);
    Point end = new Point(4,5);
    //AB = √(xb - xa)2 + (yb - ya)2
    double distance = Math.sqrt(Math.pow((end.a- start.a),2)+Math.pow((end.b- start.b),2));

    System.out.println("Расстояние между точками равно: "+distance);

    }
}

