package by.htp.jd1.linear1;
/*Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
и описанной окружностей.*/
import java.util.Scanner;

public class Linear19 {
	public static void main(String[] args) {
		double a;
		double h;
		double ro;
		double rv;
		double s;
		
		System.out.println("Введите длину стороны равностороннего треугольника");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		h = a * (Math.sqrt(3) / 2);
		s = Math.pow(a, 2) * Math.sqrt(3) / 4;
		ro = 2 * h / 3;
		rv = h / 3;
		System.out.println("Высота : " + h + " площадь : " + s + " радиус описаной окружности : " + ro
				+ " радиус вписанной окружности : " + rv);

	}
}