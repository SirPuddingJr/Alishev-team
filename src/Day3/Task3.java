package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int counter = 0;
        while (counter < 5) {
            double a = scaner.nextDouble();
            double b = scaner.nextDouble();
            counter++;if (b == 0){
                System.out.println("Деление на ноль");
                continue;

            }
            System.out.println(a / b);
        }
    }
}
