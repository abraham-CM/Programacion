package Abstractos;

public class Punto2d {
private double x, y;
public Punto2d(double x, double y) {
this.x = x;
this.y = y;
}
public static double distancia(Punto2d p1, Punto2d p2) {
return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
}
}	