package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear1 {
	//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное

	public static void main(String[] args) {
		Scanner inputNewFloat = new Scanner(System.in);
		System.out.println("Введите два числа ");
		float a;
		float b;
		a = inputNewFloat.nextFloat();
		b = inputNewFloat.nextFloat();
		System.out.print("Сумма введенных чисел: " + (a + b) + " разность введенных чисел : " + (a - b)
				+ " произведение чисел : " + (a * b) + " частное чисел : " + (a / b));

	}

}
