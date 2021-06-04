package ru.stqa.rft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " +area(s));

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " +area(r));

    Point start = new Point(2,3);
    Point end = new Point(4,5);
    //AB = √(xb - xa)2 + (yb - ya)2
    double distance = Math.sqrt(Math.pow((end.a- start.a),2)+Math.pow((end.b- start.b),2));
    System.out.println("Расстояние между точками равно: "+distance);

    }
  public static double area (Square s) {
    return s.l * s.l;
  }
  public static double area (Rectangle r){
    return r.a * r.b;
  }
}

