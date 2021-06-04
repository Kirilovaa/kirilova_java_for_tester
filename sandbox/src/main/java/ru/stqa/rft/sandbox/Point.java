package ru.stqa.rft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point p1(double x, double y){
    this.x = x;
    this.y = y;

  }
  public Point p2(double x, double y){
    this.x = x;
    this.y = y;

  }
  public static double distance (Point p1,Point p2){
    return (Math.sqrt(Math.pow((p2.x- p1.x),2)+Math.pow((p2.y- p1.y),2)));
    //AB = √(xb - xa)2 + (yb - ya)2

  public double distance(Point p);
  }
}
