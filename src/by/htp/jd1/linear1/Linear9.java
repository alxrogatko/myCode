package by.htp.jd1.linear1;

import java.util.*;

public class Linear9 {

	public static void main(String[] args) {
		float a;
		float c;
		float d;
		float b;
		float temp;
		c = 1;
		d = 1;
		System.out.println("Input a, b, c, d");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		d = sc.nextFloat();
		if (c != 0 && d != 0) {
			temp = a / c;
			temp = temp * (b / d);
			temp = temp - ((a * b) - c) / (c * d);
			System.out.println(temp);
		}
		if (c == 0 || d == 0)
			System.out.print("ERROR!!!");

	}

}
