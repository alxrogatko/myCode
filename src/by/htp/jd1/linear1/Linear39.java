package by.htp.jd1.linear1;

/* ���� �������������� ����� �. �� ��������� �������� ������� ��������������� ����������, ����� ���������,
�������� � ���������, ��������� �� ����������� ����� ��������:
2x4 - 3�3 + 4�2 - 5� + 6 */
import java.util.Scanner;

public class Linear39 {
	public static void main(String[] args) {
		for (;;) {
			double x;
			double y;
			System.out.println("������� �");
			Scanner scn = new Scanner(System.in);
			x = scn.nextDouble();

			y = x * (x * (x * (2 * x - 3) + 4) - 5) + 6;
			System.out.println(y);

		}
	}
}
