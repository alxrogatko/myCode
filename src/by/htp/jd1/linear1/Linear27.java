package by.htp.jd1.linear1;
/*���� �������� a. �� ��������� ������� ������� � ������� ��������, ����� ���������, �������� �������� �8 ��
��� �������� � �10 �� ������ ��������*/
import java.util.Scanner;
public class Linear27 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("������� �������� a");

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = a;
		a = a * a;
		a = a * a;
		
		a = a * a;
		System.out.println(a);
		//System.out.println("�������� ���� Math.pow"+(int)(Math.pow(b, 8)));
		c=b;
		c=c*c;
		c=c*c;
		c=c*c;
		c=c*b*b;
		System.out.println(c);
		//System.out.println("������� ����� Math.pow"+((int)Math.pow(b,10)));




	}
}