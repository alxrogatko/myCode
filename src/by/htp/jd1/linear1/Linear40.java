package by.htp.jd1.linear1;

//���� �������� �. �������� �������� -2� + 3�2 - 4�3 � 1 + 2� + 3�2 + 4�3 . ������������ �� �������� ��������
import java.util.Scanner;

public class Linear40 {
	public static void main(String[] args) {
		int x;
		double rez1;
		double rez2;
		System.out.println("������� x");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		rez1 = x * (x * (-4 * x + 3) - 2);
		System.out.println("��������� 1" + rez1);
		rez2 = x * (x * (4 * x + 3) + 2) + 1;
		System.out.println("��������� 2" + rez2);

	}
}