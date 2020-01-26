package by.htp.jd1.linear1;

//Найти частное произведений четных и нечетных цифр четырехзначного числа
import java.util.Scanner;

public class Linear36 {
	public static void main(String[] args) {
		float evenNum = 1;
		float oddNum = 1;
		float myNum;
		float temp;
		int counter = 0;
		System.out.println("Введите четырехзначное  число");
		Scanner scn = new Scanner(System.in);
		myNum = scn.nextFloat();
		while (counter < 4) {
			counter++;

			temp = myNum % 10;
			myNum = (int) myNum / 10;
			if (counter % 2 != 0) {
				evenNum = evenNum * temp;

			} else {
				oddNum = oddNum * temp;
			}
		}
		
			System.out.println((evenNum / oddNum));
		
	}
}