package by.htp.jd1.linear1;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью
import java.util.Scanner;

public class Linear20 {
	public static void main(String[] args) {
		double a;
		System.out.println("Введите длину окружности");
		Scanner scn = new Scanner(System.in);
		a = scn.nextFloat();
		System.out.println("Площадь круга : " + (Math.pow(a, 2) / (4 * Math.PI)));

	}
}