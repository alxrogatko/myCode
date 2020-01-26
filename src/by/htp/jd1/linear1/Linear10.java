package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear10 {
	public static void main(String[] args) {
		float x;
		float y;
		double temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("input x");
		x = scn.nextFloat();
		System.out.println("input y");
		y = scn.nextFloat();
		temp = Math.sin(x) + Math.cos(y);
		temp = temp / (Math.cos(x) + Math.sin(y));
		temp = temp * Math.tan(x * y);
		System.out.println("result is" + temp);

	}

}