package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear37 {
	public static void main(String[] args) {

		/*
		 * • Целое число N является четным двузначным числом. • Сумма двух первых цифр
		 * заданного четырехзначного числа равна сумме двух его последних цифр. • Сумма
		 * цифр данного трехзначного числа N является четным числом. • Точка с
		 * координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т,
		 * х= п (т<п). • Квадрат заданного трехзначного числа равен кубу суммы цифр
		 * этого числа. • Треугольник со сторонами а,b,с является равнобедренным. •
		 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
		 * третьей цифре. • Заданное число N является степенью числа а (показатель
		 * степени может находиться в диапазоне от 0 до 4). • График функции у = ах2 +
		 * bх+ с проходит через заданную точку с координатами (m, n).
		 */
		Scanner scn = new Scanner(System.in);

		sPo("Целое число N является четным двузначным числом: ");
		sPo("Введите число");
		double a1 = scn.nextDouble();
		if (a1 % 2 == 0 && a1 < 100 && a1 > 9) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр: ");
		sPo("Введите четырехзначное число");
		int a2 = scn.nextInt();
		int sum1;
		int sum2;
		sum1 = a2 % 10 + ((a2 / 10) % 10);
		sum2 = (a2 / 100) % 10 + ((a2 / 1000) % 10);
		if (sum1 == sum2) {
			printTrue();
		} else {
			printFalse();
		}
		sPo(" Сумма цифр данного трехзначного числа N является четным числом: ");
		sPo("Введите трехзначное число");
		int n = scn.nextInt();
		int nSum;
		nSum = 0;
		while (n > 0) {
			nSum = n % 10;
			n = n / 10;
		}
		if (nSum % 2 == 0) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n): ");
		int x1;
		int y2;
		int m1;
		int n1;
		sPo("Введите координаты точки");
		x1 = scn.nextInt();
		y2 = scn.nextInt();
		sPo("Введите m и n");
		m1 = scn.nextInt();
		n1 = scn.nextInt();
		if (x1 > m1 && x1 < n1) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа: ");
		sPo("Введите число");
		int num;
		int temp;
		num = scn.nextInt();
		temp = num % 10 + (num / 10) % 10 + (num / 100) % 10;

		if ((Math.pow(num, 2)) == Math.pow(temp, 3)) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре: ");
		int nMain;
		int n01;
		int n02;
		int n03;
		sPo("Введите трехзначное число");
		nMain = scn.nextInt();
		n01 = nMain % 10;
		nMain = nMain / 10;
		n02 = nMain % 10;
		nMain = nMain / 10;
		n03 = nMain % 10;
		if (n01 + n02 == n03 || n01 + n03 == n02 || n02 + n03 == n01) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Треугольник со сторонами а,b,с является равнобедренным: ");
		sPo("Введите значения сторон треугольника");
		int aSide;
		int bSide;
		int cSide;
		aSide = scn.nextInt();
		bSide = scn.nextInt();
		cSide = scn.nextInt();
		if (aSide == bSide || aSide == cSide || bSide == cSide) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4): ");
		int nN;
		int a;
		boolean flag;
		flag = false;
		sPo("Введите N");
		nN = scn.nextInt();
		sPo("Введите a");
		a = scn.nextInt();
		for (int i = 0; i <= 4; i++) {

			if (nN == Math.pow(a, i)) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			printTrue();
		} else {
			printFalse();
		}

		sPo("График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n): ");
		int aSq;
		int bSq;
		int cSq;
		int mSq;
		int nSq;

		sPo("Введите a, b, c");
		aSq = scn.nextInt();
		bSq = scn.nextInt();
		cSq = scn.nextInt();
		sPo("Введите m, n");
		mSq = scn.nextInt();
		nSq = scn.nextInt();
		if (nSq == (aSq * Math.pow(mSq, 2) + bSq * mSq + cSq)) {
			printTrue();
		} else {
			printFalse();
		}

	}

	static void printTrue() {
		System.out.println("true");
	}

	static void printFalse() {
		System.out.println("false");

	}

	static void sPo(String str) {
		System.out.println(str);
	}
}
