package by.htp.jd1.linear1;

/*—оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость в сто€чей воде v км/ч, скорость
течени€ реки v1 км/ч, врем€ движени€ по озеру t1 ч, а против течени€ реки Ч t2 ч.*/
import java.util.Scanner;

public class Linear31 {
	public static void main(String[] args) {
		float v;
		float v1;
		float t1;
		float t2;
		float way;
		System.out.println("¬ведите скорость лодки");
		Scanner sc = new Scanner(System.in);
		v = sc.nextFloat();
		System.out.println("¬ведите скорость течени€ реки");
		v1 = sc.nextFloat();
		System.out.println("¬ведите врем€ движени€ по озеру");
		t1 = sc.nextFloat();
		System.out.println("¬ведите врем€ движени€ по реке");
		t2 = sc.nextFloat();
		way = (v * t1) + t2 * (v - v1);
		System.out.println("ѕройденный путь: " + way);

	}

}
