package by.htp.jd1.linear1;

//Написать программу, которая выводит на экран первые четыре степени числа π.
public class Linear15 {
	public static void main(String[] args) {
		double pi;
		pi = Math.PI;
		for (int counter = 0; counter < 4; counter++) {
			System.out.println(pi);
			pi *= pi;
		}
	}
}