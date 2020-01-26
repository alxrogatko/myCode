package by.htp.jd1.linear1;

/*Ќаписать код дл€ решени€ задачи. ¬ n малых бидонах 80 л молока. —колько литров молока в m больших бидонах,
если в каждом большом бидоне на 12 л. больше, чем в малом?*/
import java.util.Scanner;

public class Linear6 {

	public static void main(String[] args) {
		int n;
		int m;
		n = 0;
		while (n == 0) {
			System.out.println("¬ведите количество малых бидонов");
			Scanner milkScan = new Scanner(System.in);
			n = milkScan.nextInt();
			System.out.println("¬ведите количество больших бидонов");
			m = milkScan.nextInt();
			if (n == 0)
				System.out.println("„то-то пошло не так");
			if (n != 0)
				System.out.print("¬ больших бидонах " + (80 / n + 12) * m + " литров молока");
		}

	}

}
