package by.htp.jd1.linear1;

//Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций
import java.util.Scanner;

public class Linear40 {
	public static void main(String[] args) {
		int x;
		double rez1;
		double rez2;
		System.out.println("Введите x");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		rez1 = x * (x * (-4 * x + 3) - 2);
		System.out.println("Результат 1" + rez1);
		rez2 = x * (x * (4 * x + 3) + 2) + 1;
		System.out.println("Результат 2" + rez2);

	}
}