package by.htp.jd1.linear1;

//11. ��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.
import java.util.Scanner;

public class Linear11 {
	public static void main(String[] args) {
		float a;
		float b;
		Scanner ab = new Scanner(System.in);
		System.out.println("input a");
		a = ab.nextFloat();
		System.out.println("input b");
		b = ab.nextFloat();
		System.out.println("S=" + (0.5 * a * b));
		System.out.println("P=" + (a + b + (Math.sqrt(a * a + b * b))));

	}
}
