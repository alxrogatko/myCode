package by.htp.jd1.linear1;

/*���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. ������� ������
�������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc.*/
import java.util.Scanner;

public class Linear22 {
	public static void main(String[] args) {
		int sec;
		int temp;
		System.out.println("������� ���������� ������");
		Scanner scn = new Scanner(System.in);
		sec = scn.nextInt();
		temp = sec / 3600;
		if (temp < 10) {
			System.out.print("0");
		}
		System.out.print(temp + " � ");
		sec = sec % 3600;
		temp = sec / 60;
		if (temp < 10) {
			System.out.print("0");
		}
		System.out.print(temp + " ��� ");
		sec = sec % 60;
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec + " ��� ");

	}
}