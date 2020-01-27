package by.htp.jd1.linear1;

//Составить алгоритм нахождения среднего арифметического двух чисел
import java.util.Scanner;

public class Linear5 {

    public static void main(String[] args) {
        System.out.println("input numbers");
        Scanner scan = new Scanner(System.in);
        float a;
        float b;
        a = scan.nextFloat();
        b = scan.nextFloat();
        System.out.println("average=" + (a + b) / 2);

    }

}
