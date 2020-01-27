package by.htp.jd1.linear1;
//14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
import java.util.Scanner;

public class Linear14 {
	public static void main(String[] args) {
		double r;
		System.out.println("Введите радиус круга ");
		Scanner scn = new Scanner(System.in);
		r = scn.nextDouble();
		System.out.print("Длина окружности  " + (Math.PI*r*2) + " Площадь круга  " + Math.PI*r*r );
		
		
	}
}
