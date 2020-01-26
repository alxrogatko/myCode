package by.htp.jd1.linear1;
//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

import java.util.Scanner;

public class Linear17 {
	public static void main(String[] args) {
		double a;
		double b;
		System.out.println("Введите два числа");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		b = scn.nextDouble();
		System.out.println("Среднее арифметическое кубов чисел : " + (Math.pow(a, 3) + Math.pow(b, 3)) / 2
				+ "  Среднее геометрическое модулей : " + Math.sqrt(Math.abs(a * b)));

	}
}