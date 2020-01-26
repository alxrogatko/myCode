package by.htp.jd1.linear1;
/*Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
три операции и а10 за четыре операции*/
import java.util.Scanner;
public class Linear27 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Введите значение a");

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = a;
		a = a * a;
		a = a * a;
		
		a = a * a;
		System.out.println(a);
		//System.out.println("Проверка ерез Math.pow"+(int)(Math.pow(b, 8)));
		c=b;
		c=c*c;
		c=c*c;
		c=c*c;
		c=c*b*b;
		System.out.println(c);
		//System.out.println("Поверка через Math.pow"+((int)Math.pow(b,10)));




	}
}