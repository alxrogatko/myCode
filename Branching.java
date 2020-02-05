package by.htp.jd1.branching;

import java.util.Scanner;

public class Branching {

	public static void main(String[] args) {

	}

}

// 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
// двух чисел заменить половиной их суммы, а большее — их удвоенным
// произведением.
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

// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
// расположена (на какой оси или в каком координатном угле).
class Task16 {
	public static void main(String[] args) {
		double a;
		double b;
		System.out.print("Введите координаты точки А");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		System.out.print("Точка А");
		if (a == 0)
			System.out.print(" принадлежит оси Х ");
		if (b == 0)
			System.out.print(" принадлежит оси У ");
		if (a > 0 && b > 0)
			System.out.print(" находится в верхнем правом");
		if (a > 0 && b < 0)
			System.out.print(" находится в нижнем правом");
		if (a < 0 && b > 0)
			System.out.print(" находится в верхнем левом");
		if (a < 0 && b < 0)
			System.out.print(" находится в нижнем левом");
		if (a != 0 && b != 0)
			System.out.print(" координатном углу");
	}
}

// 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них
// одним и тем же числом, равным большему из исходных, а если равны, то заменить
// числа нулями.
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

// 18. Подсчитать количество отрицательных среди чисел а, b, с.
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
		System.out.print("Количество отрицательных среди чисел а, b, с: " + i);
	}
}

// 19. Подсчитать количество положительных среди чисел а, b, с.
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
		System.out.print("Количество положительных среди чисел а, b, с: " + i);

	}
}

// 20. Определить, делителем каких чисел а, b, с является число k.
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

// 21. Программа — льстец. На экране высвечивается вопрос «21. Программа —
// льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д
// или М». В зависимости от ответа на экране должен появиться текст «Мне
// нравятся девочки!» или «Мне нравятся мальчики!».». .
class Task21 {
	public static void main(String[] args) {
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c == 'Д' || c == 'д') {
			System.out.print("Мне нравятся девочки!");
		} else if (c == 'М' || c == 'м') {
			System.out.print("Мне нравятся мальчики!");
		}

	}
}

// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
// большее из этих значений, а в y - меньшее.
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

// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
// месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
class Task23 {
	public static void main(String[] args) {
		System.out.println("Введите дату ");
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
			System.out.print("Неккоректные данные");

	}
}

// 24. Составить программу, определяющую результат гадания на ромашке —
// «любит—не любит», взяв за исходное данное количество лепестков п.
class Task24 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 2 + 1);
		if (a % 2 != 0) {
			System.out.print("Любит!");
		} else {
			System.out.print("Не любит...");
		}
	}
}

// 25. Написать программу — модель анализа пожарного датчика в помещении,
// которая выводит сообщение «Пожароопасная ситуация », если температура в
// комнате превысила 60° С.
class Task25 {
	public static void main(String[] args) {

		System.out.println("Imput temperature in the room");
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a > 60)
			System.out.print("Пожароопасная ситуация");
	}
}

// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
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

// 27. Найти max{min(a, b), min(c, d)}.
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

// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
// равно d, то найти max(d — a, d — b, d —c).
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

// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
// расположены на одной прямой.
class Task29 {
	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3;
		Scanner s = new Scanner(System.in);
		System.out.println("Введите координаты трех точек");
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		x3 = s.nextDouble();
		y3 = s.nextDouble();
		System.out.print("Данные точки");
		if ((x1 - x2) / (x3 - x2) != (y1 - y2) / (y3 - y2)) {
			System.out.print(" не");
		}
		System.out.print(" принадлежат одной прямой");

	}
}

// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
// заменить их абсолютными значениями, если это не так.
class Task30 {
	public static void main(String[] args) {
		System.out.println("Введите a, b, c");
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

// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.
class Task31 {
	public static void main(String[] args) {
		int a, b, x, y, z;
		boolean flag = false;
		System.out.println("Введите a, b, x, y, z");
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
			System.out.print("Пройдет");
		} else

		{
			System.out.print("Не пройдет");
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

// 32. Написать программу, которая по заданным трем числам определяет, является
// ли сумма каких-либо двух из них положительной.
class Task32 {
	public static void main(String[] args) {
		int a, b, c;
		boolean flag;
		flag = false;
		System.out.println("Введите a, b, c");
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
		System.out.print("Является ли сумма каких-либо двух чисел из них положительной: ");
		System.out.println(flag);
	}
}
// 33. Написать программу, которая по паролю будет определять уровень доступа
// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
// шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
// пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
// модули баз В, С; 9455, 8997 — доступен модуль базы С.

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

// 34. Составить программу, реализующую эпизод применения компьютера в книжном
// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
// покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
// денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
// указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
// и указывает размер недостающей суммы.
class Task34 {
	public static void main(String[] args) {
		System.out.println("Введите стоимость книг");

		Scanner s = new Scanner(System.in);
		int price, cash;
		price = s.nextInt();
		System.out.println("Введите внесенную сумму");
		cash = s.nextInt();
		if (price == cash) {
			System.out.print("Спасибо!");
		} else if (cash > price) {
			System.out.println("Ваша сдача = " + (cash - price) + " тугриков");
		} else {
			System.out.println("Нужно доплатить " + (price - cash) + " тугриков");
		}

	}
}

// 35. Вычислить число и месяц в невисокосном году по номеру дня.
class Task35 {
	public static void main(String[] args) {
		System.out.println("Введите номер дня");
		int day = 0;
		int year[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
		String[] mon = { "янв", "фев", "мар", "апр", "май", "июн", "июл", "авг", "сен", "окт", "ноя", "дек" };
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

// 36. Вычислить значение функции:
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

// 36. Вычислить значение функции:
class Task37 {
	public static void main(String[] args) {
		System.out.println("Введите х");
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

// 36. Вычислить значение функции:
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

// 36. Вычислить значение функции:
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

// 36. Вычислить значение функции:
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
