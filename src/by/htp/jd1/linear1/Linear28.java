package by.htp.jd1.linear1;

//—оставить программу перевода радианной меры угла в градусы, минуты и секунды.
import java.util.Scanner;

public class Linear28 {
	public static void main(String[] args) {
		double rad;
		double temp;
		int deg;
		int min;
		int sec;
		System.out.println("¬ведите радианную меру");
		Scanner scan = new Scanner(System.in);
		rad = scan.nextDouble();
		rad = Math.PI / 2;
		deg = (int) ((180 / Math.PI) * rad);
		temp = (int) (((180 / Math.PI) * rad) - deg) * 60;
		min = (int) temp;
		sec = (int) ((int) (((180 / Math.PI) * rad) - deg) * 60 - temp);
		System.out.print(deg + " град " + min + " минут " + sec + "секунд");

	}
}