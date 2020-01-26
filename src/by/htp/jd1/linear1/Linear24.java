package by.htp.jd1.linear1;

//Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
import java.util.Scanner;

public class Linear24 {
	public static void main(String[] args) {
		double a;
		double b;
		double alpha;
		System.out
				.println("Введите длину большего основания, меньшего основания, угол при большем основании в градусах");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		b = scn.nextDouble();
		alpha = scn.nextDouble();
		System.out.print("Площадь трапеции равна : "
				+ ((Math.pow(a, 2) - Math.pow(b, 2))) * Math.tan(Math.toRadians(alpha)) / 2);

	}

}