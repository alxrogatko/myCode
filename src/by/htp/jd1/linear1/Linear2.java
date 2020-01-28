package by.htp.jd1.linear1;
// 2. Найдите значение функции: с = 3 + а
import java.util.Scanner;
public class Linear2 {

	public static void main(String[] args) {
		float a;
		float c;
		System.out.println("Input number");
		Scanner inputNumbers = new Scanner(System.in);
		a = inputNumbers.nextFloat();
		// вариант System.out.print(3+a);
		c = 3 + a;
		System.out.print(c); 

	}

}
