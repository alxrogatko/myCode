package by.htp.jd1.linear1;

/*Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен).*/
import java.util.Scanner;

public class Linear25 {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float d;
		float x1;
		float x2;
		System.out.println("Введите поочередно коэффициенты a, b, c");
		Scanner scn = new Scanner(System.in);
		a = scn.nextFloat();
		b = scn.nextFloat();
		c = scn.nextFloat();
		d = (float) (Math.pow(b, 2) - 4 * a * c);
		if (d > 0) {
			x1 = (float) ((-b - Math.sqrt(d)) / (a * 2));
			x2 = (float) ((-b + Math.sqrt(d)) / (a * 2));
			System.out.println("x1= " + x1 + "\n" + "x2= " + x2);

		}
		if (d == 0) {
			System.out.println("x1 = x2 = " + (-1 * b / (2 * a)));
		}

		if (d < 0) {
			System.out.println("Решений нет");
		}
	}
}