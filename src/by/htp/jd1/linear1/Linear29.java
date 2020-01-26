package by.htp.jd1.linear1;

//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
import java.util.Scanner;

public class Linear29 {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float alpha;
		float beta;
		float gamma;
		float toDegree = (float) (180 / Math.PI);
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значения сторон треугольника");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		alpha = sideToAngle(a, b, c);
		beta = sideToAngle(b, c, a);
		gamma = (float) (Math.PI - alpha - beta);
		System.out.println("Радианная мера углов " + alpha + " " + beta + " " + gamma);
		System.out.println("Градусная мера углов " + (int) (alpha * toDegree) + " " + (int) (beta * toDegree) + " "
				+ (int) (gamma * toDegree));
	}

	public static float sideToAngle(float one, float two, float three) {
		float angle = 0;
		angle = (float) Math.acos((Math.pow(one, 2) + Math.pow(two, 2) - Math.pow(three, 2)) / (2 * one * two));
		return angle;
	}
}