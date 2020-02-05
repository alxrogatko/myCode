package by.htp.jd1.linear1;

/*Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
часы через р ч q мин r с?*/
import java.util.Scanner;

public class Linear32 {
	public static void main(String[] args) {
		int h;
		int m;
		int sec;

		int p;
		int q;
		int r;
		Scanner time = new Scanner(System.in);
		System.out.println("Введите значения на часах часы, минуты, секунды");
		h = time.nextInt();
		m = time.nextInt();
		sec = time.nextInt();

		System.out.println("Введите значение прошедших часов, минут, секунд");

		p = time.nextInt();
		q = time.nextInt();
		r = time.nextInt();

		p = x24(h, p);
		q = sixty(m, q);
		r = sixty(sec, r);
                if(p<10){System.out.print(0);}
		System.out.print(p + " " );
                if(q<10){System.out.print("0");}
                System.out.print(q+" ");
                if(r<10){System.out.print("0");}
                System.out.print(r);
                }
	

	public static int sixty(int s, int temp) {

		temp = temp + s;
		if (temp >= 60) {
			temp = temp % 60;
		}
		return temp;
	}

	public static int x24(int x, int temp) {

		temp = temp + x;
		if (temp >= 24) {
			temp = temp % 24;
		}
		return temp;

	}
}
