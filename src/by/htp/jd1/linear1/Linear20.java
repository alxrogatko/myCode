package by.htp.jd1.linear1;

//�������� ����� ����������. ����� ������� �����, ������������� ���� �����������
import java.util.Scanner;

public class Linear20 {
	public static void main(String[] args) {
		double a;
		System.out.println("������� ����� ����������");
		Scanner scn = new Scanner(System.in);
		a = scn.nextFloat();
		System.out.println("������� ����� : " + (Math.pow(a, 2) / (4 * Math.PI)));

	}
}