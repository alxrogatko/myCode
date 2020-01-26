package by.htp.jd1.linear1;

//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
import java.util.Scanner;

public class Linear33 {
	public static void main(String[] args) {
		char a;
		int b;
		System.out.println("Введите символ");
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		b = a;
		System.out.println("Порядковый номер " + b + " предыдущий символ: " + ((char) (a - 1)) + " следующий символ:  "
				+ ((char) (a + 1)));

	}
}
