package by.htp.jd1.linear1;

//���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� � ����� ����� ����.
import java.util.Scanner;

public class Linear18 {
	public static void main(String[] args) {
		double a;
		String str;
		System.out.println("������� ����� ����� ����");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		str = ("������� ����� ���� : " + Math.pow(a, 2) + " ������� ����������� : "+ (6 * Math.pow(a, 2) + " ����� ����� : " + Math.pow(a, 3))); 
		System.out.println(str);

	}
}