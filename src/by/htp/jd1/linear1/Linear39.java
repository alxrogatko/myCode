package by.htp.jd1.linear1;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
 сложения и вычитания, вычислите за минимальное число операций:
 2x4 - 3х3 + 4х2 - 5х + 6 */
import java.util.Scanner;

public class Linear39 {

    public static void main(String[] args) {
        for (;;) {
            double x;
            double y;
            System.out.println("Введите х");
            Scanner scn = new Scanner(System.in);
            x = scn.nextDouble();

            y = x * (x * (x * (2 * x - 3) + 4) - 5) + 6;
            System.out.println(y);

        }
    }
}
