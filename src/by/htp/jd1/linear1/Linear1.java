package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear1 {
	//1. ���� ��� �������������� ����� � � �. ��������� �� �����, ��������, ������������ � �������

	public static void main(String[] args) {
		Scanner inputNewFloat = new Scanner(System.in);
		System.out.println("������� ��� �����");
		float a;
		float b;
		a = inputNewFloat.nextFloat();
		b = inputNewFloat.nextFloat();
		System.out.print("����� ��������� �����: " + (a + b) + " �������� ��������� �����: " + (a - b)
				+ " ������������ �����: " + (a * b) + " ������� �����: " + (a / b));

	}

}
