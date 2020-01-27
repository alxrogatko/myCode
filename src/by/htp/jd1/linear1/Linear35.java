package by.htp.jd1.linear1;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
import java.util.Scanner;

public class Linear35 {
	public static void main(String[] args) {
		double n;
		double m;
		int a;
		int b;
		double c;
		String str;
		char ch1;
		char ch2;
		
                System.out.println("Введите два числа");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		c = (double) (n / m);
		str = String.valueOf(c);
		a = str.indexOf(".");
		ch1 = str.charAt(a - 1);
		ch2 = str.charAt(a + 1);
		a = Character.getNumericValue(ch1);
		b = Character.getNumericValue(ch2);
		System.out.print(c + " " + a + " " + b);

	}
}
