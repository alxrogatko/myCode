package by.htp.jd1.linear1;

/*Дано  действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/
import java.util.Scanner;

public class Linear21 {
	public static void main(String[] args) {

		double a = 0;
		System.out.println("Введите число вида nnn.ddd");
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		int b = 0;
		double temp2 = 0;
		int tempInt = 0;
		b = (int) a;
		tempInt = (int) Math.round((a - b) * 1000);

		temp2 = (double) b / 1000;

		System.out.println((double) tempInt + temp2);

	}
}