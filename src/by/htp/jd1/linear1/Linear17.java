package by.htp.jd1.linear1;
//17. ���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.

import java.util.Scanner;

public class Linear17 {
	public static void main(String[] args) {
		double a;
		double b;
		System.out.println("������� ��� �����");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		b = scn.nextDouble();
		System.out.println("������� �������������� ����� ����� : " + (Math.pow(a, 3) + Math.pow(b, 3)) / 2
				+ "  ������� �������������� ������� : " + Math.sqrt(Math.abs(a * b)));

	}
}