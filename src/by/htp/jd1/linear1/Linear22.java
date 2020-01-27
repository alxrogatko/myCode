package by.htp.jd1.linear1;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc. */
import java.util.Scanner;

public class Linear22 {
	public static void main(String[] args) {
		int sec;
		int temp;
		System.out.println("Введите количество секунд");
		Scanner scn = new Scanner(System.in);
		sec = scn.nextInt();
		temp = sec / 3600;
		if (temp < 10) {
			System.out.print("0");
		}
		System.out.print(temp + " ÷ ");
		sec = sec % 3600;
		temp = sec / 60;
		if (temp < 10) {
			System.out.print("0");
		}
		System.out.print(temp + " ìèí ");
		sec = sec % 60;
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec + " ñåê ");

	}
}
