package by.htp.jd1.linear1;

/*���� �������� �, ���������� ����� ���������� � ������. ��������� � � ����� ������� ������� ���������
����������.*/
import java.util.Scanner;

public class Linear34 {
	public static void main(String[] args) {
		long infa;
		float kb;
		float mb;
		int gb;
		float tb;

		System.out.println("������� ����� � ������");
		Scanner scn = new Scanner(System.in);
		infa = scn.nextLong();
		kb = infa / 1024;
		mb = kb / 1024;
		gb = (int) (mb / 1024);
		tb = gb / 1024;
		System.out.println(kb + "kB " + mb + "MB " + gb + "GB " + tb + "TB");

	}
}