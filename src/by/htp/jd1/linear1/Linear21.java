package by.htp.jd1.linear1;

/*����  �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
������� � ����� ����� ����� � ������� ���������� �������� �����.*/
import java.util.Scanner;

public class Linear21 {
	public static void main(String[] args) {

		double a = 0;
		System.out.println("������� ����� ���� nnn.ddd");
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		int b = 0;
		double temp2 = 0;
		int tempInt = 0;
		b = (int) a;
		tempInt = (int) Math.round((a - b) * 1000);

		temp2 = (double) b / 1000;

		System.out.println((double) tempInt + temp2);

	}
}