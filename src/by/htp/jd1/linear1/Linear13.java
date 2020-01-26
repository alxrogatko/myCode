package by.htp.jd1.linear1;

import java.util.Scanner;

// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
public class Linear13 {
	public static void main(String[] args) {
		float x1;
		float x2;
		float x3;
		float y1;
		float y2;
		float y3;
		float a;
		float b;
		float c;
		float s;
		s = 0;
		System.out.println("введите координаты точек x1, y1, x2, y2, x3, y3");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		x3 = sc.nextFloat();
		y3 = sc.nextFloat();
		a = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = (float) Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y2 - y1), 2));
		c = (float) Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		System.out.println("P=" + (a + b + c));
		if (c > a && c > b)
			s = a * b / 2;
		if (a > c && a > b)
			s = b * c / 2;
		if (b > a && b > c)
			s = a * c / 2;
		System.out.println("S=" + s);

	}

}
