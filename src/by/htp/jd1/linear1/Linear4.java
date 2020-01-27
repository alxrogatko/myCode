package by.htp.jd1.linear1;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
import java.util.Scanner;

public class Linear4 {

    public static void main(String[] args) {
        System.out.println("Input numbers");
        Scanner numb = new Scanner(System.in);
        float a;
        float b;
        float c;
        float z;
        a = numb.nextFloat();
        b = numb.nextFloat();
        c = numb.nextFloat();
        z = ((a - 3) * b / 2) + c;
        System.out.println("z=" + z);

    }

}
