package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear37 {
	public static void main(String[] args) {

		/*
		 * � ����� ����� N �������� ������ ���������� ������. � ����� ���� ������ ����
		 * ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����. � �����
		 * ���� ������� ������������ ����� N �������� ������ ������. � ����� �
		 * ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �,
		 * �= � (�<�). � ������� ��������� ������������ ����� ����� ���� ����� ����
		 * ����� �����. � ����������� �� ��������� �,b,� �������� ��������������. �
		 * ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N �����
		 * ������� �����. � �������� ����� N �������� �������� ����� � (����������
		 * ������� ����� ���������� � ��������� �� 0 �� 4). � ������ ������� � = ��2 +
		 * b�+ � �������� ����� �������� ����� � ������������ (m, n).
		 */
		Scanner scn = new Scanner(System.in);

		sPo("����� ����� N �������� ������ ���������� ������: ");
		sPo("������� �����");
		double a1 = scn.nextDouble();
		if (a1 % 2 == 0 && a1 < 100 && a1 > 9) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����: ");
		sPo("������� �������������� �����");
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
		sPo(" ����� ���� ������� ������������ ����� N �������� ������ ������: ");
		sPo("������� ����������� �����");
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
		sPo("����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= m, �= n (m<n): ");
		int x1;
		int y2;
		int m1;
		int n1;
		sPo("������� ���������� �����");
		x1 = scn.nextInt();
		y2 = scn.nextInt();
		sPo("������� m � n");
		m1 = scn.nextInt();
		n1 = scn.nextInt();
		if (x1 > m1 && x1 < n1) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����: ");
		sPo("������� �����");
		int num;
		int temp;
		num = scn.nextInt();
		temp = num % 10 + (num / 10) % 10 + (num / 100) % 10;

		if ((Math.pow(num, 2)) == Math.pow(temp, 3)) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("� ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����: ");
		int nMain;
		int n01;
		int n02;
		int n03;
		sPo("������� ����������� �����");
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
		sPo("����������� �� ��������� �,b,� �������� ��������������: ");
		sPo("������� �������� ������ ������������");
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
		sPo("�������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4): ");
		int nN;
		int a;
		boolean flag;
		flag = false;
		sPo("������� N");
		nN = scn.nextInt();
		sPo("������� a");
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

		sPo("������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, n): ");
		int aSq;
		int bSq;
		int cSq;
		int mSq;
		int nSq;

		sPo("������� a, b, c");
		aSq = scn.nextInt();
		bSq = scn.nextInt();
		cSq = scn.nextInt();
		sPo("������� m, n");
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
