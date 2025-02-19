package Abstractos;

public class triangulo extends Figura2D {
private Punto2d p1,p2,p3;
public triangulo(Punto2d p1, Punto2d p2, Punto2d p3) {
super(3);
this.p1 = p1;
this.p2 = p2;
this.p3 = p3;
}
public double area() {
double a = Punto2d.distancia(p1, p2);
double b = Punto2d.distancia(p2, p3);
double c = Punto2d.distancia(p3, p1);
double s = (a + b + c) / 2;
return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
}
public void perimetro(double a, double b, double c) {
	double p= a+b+c;
	System.out.println("el perimetro es "+ p);
	
}

public void esTriangulo() {
	double array[]= a, b, c;
}

}