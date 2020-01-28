package by.htp.jd1.linear1;
/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏 + √𝑏2 + 4𝑎𝑐
2𝑎 − 𝑎3𝑐 + 𝑏−2 */
import java.util.Scanner;

public class Linear8 {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float temp;
		System.out.println("Input a , b , c");
		Scanner abc = new Scanner(System.in);

		a = abc.nextFloat();
		b = abc.nextFloat();
		c = abc.nextFloat();
		temp = b * b + 4 * a * c;
		temp = (float) Math.sqrt(temp);
		temp = b + temp;
		temp = temp / (2 * a);
		temp = temp - a * a * a * c;
		temp = temp + (1 / (b * b));
		System.out.print(temp);
	}

}
