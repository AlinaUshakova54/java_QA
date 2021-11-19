package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");

		Squere s = new Squere(5);
		System.out.println("Площадь квадрата со стороной " + s.l +"= " + area(s));

		Rectangle r = new Rectangle(6,8);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}

	public static double area(Squere s) {
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}
}