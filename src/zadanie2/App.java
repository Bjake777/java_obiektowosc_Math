package zadanie2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double min;
        double max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj min");
        min = scanner.nextDouble();
        System.out.println("podaj max");
        max = scanner.nextDouble();

        double a = Math.random() * (max - min + 1) + min;
        double b = Math.random() * (max - min + 1) + min;

        System.out.println("log ab: "+Math.log(a*b));
        System.out.println("cos a"+Math.cos(a));
        System.out.println("tg b"+Math.tan(b));
    }
}
