package by.htp.jd1.linear1;

/*��������� ��������� ��� ���������� ����, ����������� ������, ���� �� �������� � ������� ���� v ��/�, ��������
������� ���� v1 ��/�, ����� �������� �� ����� t1 �, � ������ ������� ���� � t2 �.*/
import java.util.Scanner;

public class Linear31 {
	public static void main(String[] args) {
		float v;
		float v1;
		float t1;
		float t2;
		float way;
		System.out.println("������� �������� �����");
		Scanner sc = new Scanner(System.in);
		v = sc.nextFloat();
		System.out.println("������� �������� ������� ����");
		v1 = sc.nextFloat();
		System.out.println("������� ����� �������� �� �����");
		t1 = sc.nextFloat();
		System.out.println("������� ����� �������� �� ����");
		t2 = sc.nextFloat();
		way = (v * t1) + t2 * (v - v1);
		System.out.println("���������� ����: " + way);

	}

}
