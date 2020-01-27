package by.htp.jd1.linear1;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 
import java.util.Scanner;

public class Linear18 {
	public static void main(String[] args) {
		double a;
		String str;
		System.out.println("Введите длину ребра куба");
		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		str = ("Площадь грани куба  : " + Math.pow(a, 2) + " Площадь поверхности : "+ (6 * Math.pow(a, 2) + " Объем равен : " + Math.pow(a, 3))); 
		System.out.println(str);

	}
}
