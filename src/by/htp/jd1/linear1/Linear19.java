package by.htp.jd1.linear1;
/*���� ������� ��������������� ������������. ����� ������� ����� ������������, ��� ������, ������� ���������
� ��������� �����������.*/
import java.util.Scanner;

public class Linear19 {
	public static void main(String[] args) {
		double a;
		double h;
		double ro;
		double rv;
		double s;
		
		System.out.println("������� ����� ������� ��������������� ������������");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		h = a * (Math.sqrt(3) / 2);
		s = Math.pow(a, 2) * Math.sqrt(3) / 4;
		ro = 2 * h / 3;
		rv = h / 3;
		System.out.println("������ : " + h + " ������� : " + s + " ������ �������� ���������� : " + ro
				+ " ������ ��������� ���������� : " + rv);

	}
}