package by.htp.jd1.linear1;

//������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ���������� � ����������� �������.
import java.util.Scanner;

public class Linear33 {
	public static void main(String[] args) {
		char a;
		int b;
		System.out.println("������� ������");
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		b = a;
		System.out.println("���������� ����� " + b + " ���������� ������: " + ((char) (a - 1)) + " ��������� ������:  "
				+ ((char) (a + 1)));

	}
}
