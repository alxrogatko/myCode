package by.htp.jd1.linear1;

//��� ������������� R1 R2, � R3 ��������� �����������. ������� ������������� ����������
import java.util.Scanner;

public class Linear30 {
	public static void main(String[] args) {
		float r1;
		float r2;
		float r3;
		Scanner electroScanner = new Scanner(System.in);
		System.out.println("������� �������� ������������� ����������");
		r1 = electroScanner.nextInt();
		r2 = electroScanner.nextInt();
		r3 = electroScanner.nextInt();
		r1 = 1 / r1;
		r2 = 1 / r2;
		r3 = 1 / r3;
		System.out.println("����� ������������� " + (1 / (r1 + r2 + r3)));
	}
}