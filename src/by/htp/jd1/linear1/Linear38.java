package by.htp.jd1.linear1;

/* ��� ������ �������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
����������� ����������� �������, � false � � ��������� ������: */
//!!!����������� ������� ������ ���������������� ����������� �������
import java.util.Scanner;

public class Linear38 {
	public static void main(String[] args) {
		double x;
		double y;
		double y1;
		double y2;
		boolean flag;
		flag = false;
		System.out.println("��� ������� ������");
		System.out.println("������� ���������� �����");
		Scanner scn = new Scanner(System.in);
		x = scn.nextDouble();
		y = scn.nextDouble();
		y1 = x + 4;
		y2 = (-1 * x + 4);
		if (y < y1 && y < y2 && y > 0) {
			System.out.print("true");
		} else {
			System.out.println("false");

		}
		System.out.println("��� ������� ������");
		System.out.println("������� ���������� �����");
		x = scn.nextDouble();
		y = scn.nextDouble();
		if (y > 0 && y > -3 && x > -4 && x < 4)
			flag = true;
		if (y == 0 && x > -2 && x < 2)
			flag = true;
		if (y > 0 && y < 4 && x > -2 && x < 2)
			flag = true;
		System.out.println(flag);

		System.out.println("��� �������� ������");
		System.out.println("������� ���������� �����");
		flag = false;
		x = scn.nextDouble();
		y = scn.nextDouble();
		if (x > 0 && y > 0 && y < (Math.sqrt((Math.pow(4, 2) - Math.pow(x, 2)))))
			flag = true;
		if (x > 0 && y < 0 && Math.abs(y) < (Math.sqrt(Math.pow(5, 2) - Math.pow(x, 2))))
			flag = true;
		if (y == 0 && x > 0 && x < 4)
			flag = true;
		System.out.print(flag);

	}

}
