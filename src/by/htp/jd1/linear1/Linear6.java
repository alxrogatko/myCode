package by.htp.jd1.linear1;

/*�������� ��� ��� ������� ������. � n ����� ������� 80 � ������. ������� ������ ������ � m ������� �������,
���� � ������ ������� ������ �� 12 �. ������, ��� � �����?*/
import java.util.Scanner;

public class Linear6 {

	public static void main(String[] args) {
		int n;
		int m;
		n = 0;
		while (n == 0) {
			System.out.println("������� ���������� ����� �������");
			Scanner milkScan = new Scanner(System.in);
			n = milkScan.nextInt();
			System.out.println("������� ���������� ������� �������");
			m = milkScan.nextInt();
			if (n == 0)
				System.out.println("���-�� ����� �� ���");
			if (n != 0)
				System.out.print("� ������� ������� " + (80 / n + 12) * m + " ������ ������");
		}

	}

}
