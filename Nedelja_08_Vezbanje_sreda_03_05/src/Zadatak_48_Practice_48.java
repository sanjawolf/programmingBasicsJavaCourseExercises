import java.util.Scanner;

public class Zadatak_48_Practice_48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int leftNumber = Integer.parseInt(sc.nextLine());
        int rightInterval = Integer.parseInt(sc.nextLine());
        int i;

        for (i = leftNumber; i <= rightInterval; i++) {

            int secondDigit = i / 10000%10;
            int fourthDigit = i / 100 % 10;
            int sixthDigit = i % 10;
            int firstDigit = i / 100000;
            int thirdDigit = i / 1000 % 10;
            int fifthDigit = i / 10 % 10;

            if (secondDigit + fourthDigit + sixthDigit == firstDigit + thirdDigit + fifthDigit) {

                System.out.print(i + " ");
            }
        }
    }
}
