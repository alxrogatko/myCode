package by.htp.jd1.linear1;

// ������� �������� �������: z = 2 * x + ( y � 2 ) * 5
import java.util.Scanner;

public class Linear3 {

	public static void main(String[] args) {
		System.out.println("������� �������� � � �");
		Scanner inputNumber = new Scanner(System.in);
		float z;
		float x;
		float y;
		x = inputNumber.nextFloat();
		y = inputNumber.nextFloat();
		z = (y - 2) * 5 + 2 * x;
		System.out.println("z= " + z);

	}

}
