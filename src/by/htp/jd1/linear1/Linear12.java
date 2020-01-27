package by.htp.jd1.linear1;

//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
import java.util.Scanner;

public class Linear12 {
	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		System.out.println("Введите координаты точек х1, y1, x2, y2");
		Scanner scn = new Scanner(System.in);
		x1 = scn.nextDouble();
		y1 = scn.nextDouble();
		x2 = scn.nextDouble();
		y2 = scn.nextDouble();
		System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

	}
}
