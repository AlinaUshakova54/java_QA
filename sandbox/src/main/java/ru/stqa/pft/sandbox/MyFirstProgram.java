package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l +"= " + s.area()); 

		Rectangle r = new Rectangle(6,8);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p1 = new Point(6,1);
		Point p2 = new Point(2,6);

		System.out.println("Координаты точки 1 (" + p1.x + ";" + p1.y + ")");
		System.out.println("Координаты точки 2 (" + p2.x + ";" + p2.y + ")");

		System.out.println("Расстояние между точками = " + p2.distance(p1));
	}


}