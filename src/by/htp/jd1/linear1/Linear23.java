package by.htp.jd1.linear1;

//����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r).
import java.util.Scanner;

public class Linear23 {
	public static void main(String[] args) {

		double rOut;
		double rIn;
		System.out.println("������� R � r");
		Scanner scn = new Scanner(System.in);
		rOut = scn.nextDouble();
		rIn = scn.nextDouble();
		System.out.println("������� ������: " + (Math.PI * Math.pow(rOut, 2) - Math.PI * Math.pow(rIn, 2)));

	}
}