package by.htp.jd1.linear1;

//Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
import java.util.Scanner;

public class Linear7 {

    public static void main(String[] args) {
        float a;

        System.out.println("Введите значение стороны прямоугольника");
        Scanner inputLong = new Scanner(System.in);
        a = inputLong.nextFloat();
        System.out.println("Площадь, если вы вводили длину " + a * a / 2 + ", если вводили ширину " + a * a * 2);

    }

}
