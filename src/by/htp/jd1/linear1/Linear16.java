package by.htp.jd1.linear1;
//Найти произведение цифр заданного четырехзначного числа 
import java.util.Scanner;

public class Linear16 {
	public static void main(String[] args) {
		int a, b;
		int temp1 = 0, temp2 = 1;
		System.out.println("Ââĺäčňĺ ÷čńëî");
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = a;
		while (a >= 10) {
			temp1 = a % 10;
			a = a / 10;
			temp2 = temp2 * temp1;
		}

		System.out.println("Произведение цифр числа " + b + " : " + temp2);

	}
}
