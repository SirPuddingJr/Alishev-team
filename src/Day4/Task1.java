package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayL = scanner.nextInt();

        Random random = new Random();


        int [] array = new int[arrayL];
        for (int i = 0; i < array.length; i++)
            array [i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        int cor8 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 8);
            cor8++;

        }
        System.out.println(cor8);

        int cor1 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1);
            cor1++;

        }
        System.out.println(cor1);

        int corEven = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0);
            corEven++;

        }
        System.out.println(corEven);

        int corOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0);
            corOdd++;

        }
        System.out.println(corOdd);

        int sum = 0;
        for (int i = 0; i < arrayL; i++){
            sum += array[i];

        }
        System.out.println(sum);
    }
}
