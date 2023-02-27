package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorCount = scanner.nextInt();

        if ( floorCount >= 1 && floorCount <= 4){
            System.out.println("Малоэтажное здание");
        } else if (floorCount >= 5 && floorCount <=8) {
            System.out.println("среднеэтажное здание");
        } else if (floorCount >= 9) {
            System.out.println("многоэтажный дом");
        }else {
            System.out.println("некорректный ввод");
        }
    }
}
