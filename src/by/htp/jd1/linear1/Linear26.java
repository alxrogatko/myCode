package by.htp.jd1.linear1;
//����� ������� ������������, ��� ������� �������� ����� � � b, � ���� ����� ����� ��������� �.
import java.util.Scanner;
public class Linear26 {
	public static void main(String[] args) {
		double a;
		double b;
		double alpha;
		double s;
		System.out.println("������� �������� ���� ������ ������������ � �������� ���� � ��������");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		b = scn.nextDouble();
		alpha = scn.nextDouble();
		alpha = Math.toRadians(alpha);
		s = Math.sin(alpha)*a*b/2;
		System.out.println("������� ������������ : "+s);
		
		
	}
}