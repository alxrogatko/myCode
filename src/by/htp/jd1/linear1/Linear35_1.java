package by.htp.jd1.linear1;

import java.util.Scanner;
//���� ����������� ����� � � N. ������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N
public class Linear35_1 {
	public static void main(String[] args) {
		int m;
		int n;
		float mn;
		int a;
		int b;
		float temp;
		int temp1;
		System.out.println("������� ����� M � N");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		mn = (float) m / n;
		System.out.print("M/N= " + mn + "  ");
		temp1 = (int) mn;
		temp = (mn - temp1) * 10;
		a = (int) temp;

		temp = mn / 10;
		temp1 = (int) temp;
		mn = (temp - temp1) * 10;
		b = (int) mn;

		System.out.print(" ������� ����� " + a + " � " + b);

	}
}