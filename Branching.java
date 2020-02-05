package by.htp.jd1.branching;

import java.util.Scanner;

public class Branching {

	public static void main(String[] args) {

	}

}

// 15. ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ����
// ���� ����� �������� ��������� �� �����, � ������� � �� ���������
// �������������.
class Task15 {
	public static void main(String[] args) {
		double a;
		double b;
		double temp;
		System.out.print("Input a , b ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		temp = (a + b) / 2;
		if (a < b) {
			b = 2 * a * b;
			a = temp;
		} else {
			a = 2 * a * b;
			b = temp;
		}

		System.out.println("a =" + a + " , b = " + b);

	}
}

// 16. �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ���
// ����������� (�� ����� ��� ��� � ����� ������������ ����).
class Task16 {
	public static void main(String[] args) {
		double a;
		double b;
		System.out.print("������� ���������� ����� �");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		System.out.print("����� �");
		if (a == 0)
			System.out.print(" ����������� ��� � ");
		if (b == 0)
			System.out.print(" ����������� ��� � ");
		if (a > 0 && b > 0)
			System.out.print(" ��������� � ������� ������");
		if (a > 0 && b < 0)
			System.out.print(" ��������� � ������ ������");
		if (a < 0 && b > 0)
			System.out.print(" ��������� � ������� �����");
		if (a < 0 && b < 0)
			System.out.print(" ��������� � ������ �����");
		if (a != 0 && b != 0)
			System.out.print(" ������������ ����");
	}
}

// 17. ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ���
// ����� � ��� �� ������, ������ �������� �� ��������, � ���� �����, �� ��������
// ����� ������.
class Task17 {
	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("Input a , b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a == b) {
			a = b = 0;
		}
		if (a > b) {
			b = a;
		} else {
			a = b;
		}
		System.out.print("a = " + a + " , b = " + b);

	}
}

// 18. ���������� ���������� ������������� ����� ����� �, b, �.
class Task18 {
	public static void main(String[] args) {
		double a, b, c;
		int i = 0;
		System.out.println("Input a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (a < 0)
			i++;
		if (b < 0)
			i++;
		if (c < 0)
			i++;
		System.out.print("���������� ������������� ����� ����� �, b, �: " + i);
	}
}

// 19. ���������� ���������� ������������� ����� ����� �, b, �.
class Task19 {
	public static void main(String[] args) {
		double a, b, c;
		int i = 0;
		System.out.println("Input a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (a > 0)
			i++;
		if (b > 0)
			i++;
		if (c > 0)
			i++;
		System.out.print("���������� ������������� ����� ����� �, b, �: " + i);

	}
}

// 20. ����������, ��������� ����� ����� �, b, � �������� ����� k.
class Task20 {
	public static void main(String[] args) {
		int a, b, c, k;
		System.out.println("Input a, b, c, k");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();
		printNum(a, k);
		printNum(b, k);
		printNum(c, k);
	}

	static void printNum(int n, int k) {
		if (n % k == 0)
			System.out.print(n + " ");
	}
}

// 21. ��������� � ������. �� ������ ������������� ������ �21. ��������� �
// ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� �
// ��� ̻. � ����������� �� ������ �� ������ ������ ��������� ����� ����
// �������� �������!� ��� ���� �������� ��������!�.�. .
class Task21 {
	public static void main(String[] args) {
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c == '�' || c == '�') {
			System.out.print("��� �������� �������!");
		} else if (c == '�' || c == '�') {
			System.out.print("��� �������� ��������!");
		}

	}
}

// 22. ���������������� �������� ���������� � � � ���, ����� � � ���������
// ������� �� ���� ��������, � � y - �������.
class Task22 {
	public static void main(String[] args) {
		System.out.println("Input x, y");
		double x;
		double y;
		double temp;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		System.out.print("x= " + x + " , y=" + y);
	}

}

// 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
// ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
class Task23 {
	public static void main(String[] args) {
		System.out.println("������� ���� ");
		int a;
		int b;
		boolean flag = true;
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		if (a <= 0 || a > 31)
			flag = false;
		if (b <= 0 || b > 31)
			flag = false;
		if (flag == false)
			System.out.print("������������ ������");

	}
}

// 24. ��������� ���������, ������������ ��������� ������� �� ������� �
// �������� �����, ���� �� �������� ������ ���������� ��������� �.
class Task24 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 2 + 1);
		if (a % 2 != 0) {
			System.out.print("�����!");
		} else {
			System.out.print("�� �����...");
		}
	}
}

// 25. �������� ��������� � ������ ������� ��������� ������� � ���������,
// ������� ������� ��������� �������������� �������� �, ���� ����������� �
// ������� ��������� 60� �.
class Task25 {
	public static void main(String[] args) {

		System.out.println("Imput temperature in the room");
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a > 60)
			System.out.print("������������� ��������");
	}
}

// 26. �������� ��������� ���������� ����� �������� � �������� �� ���� �����.
class Task26 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.print("Input a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(minimum(a, b, c) + maximum(a, b, c));
	}

	static int minimum(int a, int b, int c) {
		int m;
		m = a;
		if (a > b) {
			m = b;
		}
		if (c < b && c < a) {
			m = c;
		}
		return m;
	}

	static int maximum(int a, int b, int c) {
		int m;
		m = a;
		if (a < b) {
			m = b;
		}
		if (b < c && a < c) {
			m = c;

		}
		return m;
	}
}

// 27. ����� max{min(a, b), min(c, d)}.
class Task27 {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		System.out.println(max(min(a, b), min(c, d)));

	}

	public static int min(int a, int b) {
		int m;
		m = a;
		if (b < a) {
			m = b;
		}

		return m;

	}

	public static int max(int a, int b) {
		int m;
		m = a;
		if (b > a) {
			m = b;
		}
		return m;
	}
}

// 28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
// ����� d, �� ����� max(d � a, d � b, d �c).
class Task28 {
	public static void main(String[] args) {
		int a, b, c, d;
		System.out.println("Input a, b, c, d");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if (a != d && b != d && c != d) {
			System.out.println(maximum(d - a, d - b, d - c));

		} else {
			System.out.print("d = ");
		}
		if (d == a) {
			System.out.print("a");
		}
		if (d == b) {
			System.out.print("b");
		}
		if (d == c) {
			System.out.print("c");
		}
	}

	static int maximum(int a, int b, int c) {
		int m;
		m = a;
		if (b > a) {
			m = b;
		}
		if (c > b && c > a) {
			m = c;
		}
		return m;

	}

}

// 29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
// ����������� �� ����� ������.
class Task29 {
	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3;
		Scanner s = new Scanner(System.in);
		System.out.println("������� ���������� ���� �����");
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		x3 = s.nextDouble();
		y3 = s.nextDouble();
		System.out.print("������ �����");
		if ((x1 - x2) / (x3 - x2) != (y1 - y2) / (y3 - y2)) {
			System.out.print(" ��");
		}
		System.out.print(" ����������� ����� ������");

	}
}

// 30. ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, �
// �������� �� ����������� ����������, ���� ��� �� ���.
class Task30 {
	public static void main(String[] args) {
		System.out.println("������� a, b, c");
		double a, b, c;
		Scanner s = new Scanner(System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a + ", b =" + b + ", c = " + c);
	}
}

// 31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
// ����������, ������� �� ������ ����� ���������.
class Task31 {
	public static void main(String[] args) {
		int a, b, x, y, z;
		boolean flag = false;
		System.out.println("������� a, b, x, y, z");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		for (int i = 0; i < 3; i++) {
			flag = newMethod(a, b, x, y);
			if (flag == true)
				break;
			flag = newMethod(a, b, x, z);
			if (flag == true)
				break;
			flag = newMethod(a, b, z, y);
		}
		if (flag == true) {
			System.out.print("�������");
		} else

		{
			System.out.print("�� �������");
		}
	}

	static boolean newMethod(int a, int b, int c, int d) {
		boolean prolezet = false;
		if ((a >= c && b >= d) || (a >= d && b >= c)) {
			prolezet = true;
		}

		return prolezet;
	}

}

// 32. �������� ���������, ������� �� �������� ���� ������ ����������, ��������
// �� ����� �����-���� ���� �� ��� �������������.
class Task32 {
	public static void main(String[] args) {
		int a, b, c;
		boolean flag;
		flag = false;
		System.out.println("������� a, b, c");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ((a + b) > 0)
			flag = true;
		if ((b + c) > 0)
			flag = true;
		if ((a + c) > 0)
			flag = true;
		System.out.print("�������� �� ����� �����-���� ���� ����� �� ��� �������������: ");
		System.out.println(flag);
	}
}
// 33. �������� ���������, ������� �� ������ ����� ���������� ������� �������
// ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
// ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ���������
// ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
// ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.

class Task33 {
	public static void main(String[] args) {
		System.out.println("Input password");
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if (a == 9583 || a == 1747) {
			emulA();
			emulB();
			emulC();
		} else if (a == 3331 || a == 7922) {
			emulB();
			emulC();
		} else if (a == 9455 || a == 8997) {
			emulC();
		} else {
			System.out.println("Access denied");
		}
	}

	public static void emulA() {
		System.out.println("Module A: 122 565 5565 5656 5365 7885 5245 5245 55556");

	}

	public static void emulB() {
		System.out.println("Module B: 5455 5665 5655 56523 55265 66566 65555");
	}

	public static void emulC() {
		System.out.println("Module C: 552 5533 65533 56533 5656 ");
	}
}

// 34. ��������� ���������, ����������� ������ ���������� ���������� � �������
// ��������. ��������� ����������� ��������� ����, ����� �����, ���������
// �����������; ���� ����� �� ���������, �������� �� ������ ��������; ����
// ����� ������� ������, ��� ����������, �� �������� ��������� ����� �
// ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ����
// � ��������� ������ ����������� �����.
class Task34 {
	public static void main(String[] args) {
		System.out.println("������� ��������� ����");

		Scanner s = new Scanner(System.in);
		int price, cash;
		price = s.nextInt();
		System.out.println("������� ��������� �����");
		cash = s.nextInt();
		if (price == cash) {
			System.out.print("�������!");
		} else if (cash > price) {
			System.out.println("���� ����� = " + (cash - price) + " ��������");
		} else {
			System.out.println("����� ��������� " + (price - cash) + " ��������");
		}

	}
}

// 35. ��������� ����� � ����� � ������������ ���� �� ������ ���.
class Task35 {
	public static void main(String[] args) {
		System.out.println("������� ����� ���");
		int day = 0;
		int year[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
		String[] mon = { "���", "���", "���", "���", "���", "���", "���", "���", "���", "���", "���", "���" };
		Scanner sc = new Scanner(System.in);

		day = sc.nextInt();
		int temp, temp1;
		for (int i = 0; i < 12; i++) {
			temp = year[i];
			temp1 = year[i + 1];

			if (day > temp && day <= temp1) {
				System.out.print(day - year[i] + " ");

				System.out.println(mon[i]);
				break;
			}

		}

	}
}

// 36. ��������� �������� �������:
class Task36 {
	public static void main(String[] args) {
		double f;
		double x;
		double f1;
		System.out.println("input x");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("F(x) = " + f);

	}
}

// 36. ��������� �������� �������:
class Task37 {
	public static void main(String[] args) {
		System.out.println("������� �");
		Scanner sc = new Scanner(System.in);
		double x;
		double f;
		x = sc.nextDouble();
		if (x >= 3) {
			f = (-x * x + 3 * x + 9);
		} else {
			f = 1 / (x * x * x - 6);
		}

		System.out.println("F(x) = " + f);
	}
}

// 36. ��������� �������� �������:
class Task38 {
	public static void main(String[] args) {
		double x;
		double f;
		System.out.print("Input x");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		if (x > 0 && x < 3 || x == 0 || x == 3) {
			f = x * x;
		} else {
			f = 4;
		}
		System.out.println("F(x) = " + f);

	}
}

// 36. ��������� �������� �������:
class Task39 {
	public static void main(String[] args) {
		double x;
		double y;
		System.out.println("Input x");
		Scanner s = new Scanner(System.in);
		x = s.nextDouble();
		if (x >= 8) {
			y = -Math.pow(x, 2) + x - 9;
		} else {
			y = 1 / ((Math.pow(x, 4) - 6));
		}
		System.out.println("F(x) = " + y);

	}
}

// 36. ��������� �������� �������:
class Task40 {
	public static void main(String[] args) {
		double x, y;
		System.out.println("Input x");
		Scanner s = new Scanner(System.in);
		x = s.nextDouble();
		if (x <= 13) {
			y = -x * x + 9;
		} else {
			y = -3 / (x + 1);
		}
		System.out.println("F(" + x + ") = " + y);

	}
}