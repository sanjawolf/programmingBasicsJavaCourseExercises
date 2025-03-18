import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        int i;

        while (true) {

            String numberText = sc.nextLine();

            if (numberText.equals("stop")) {

                break;

            }

            int number = Integer.parseInt(numberText);

            if (number < 0) {

                System.out.println("Number is negative.");

            }

//            for(i=1; i<=number; i++) {
//
//                if (number > 0) {
//
//                    if (number % i == 0) {
//
//                        counter++;
//
//                    }
//
//                } else if (number == 0) {
//
//                    sumNonPrime += number;
//
//                }
//
//            }

            else{

                boolean prime = true;

                for (i = 2; i <= number - 1; i++) {

                    if (number % i == 0) {

                        prime = false;
                        break;

                    }
                }




                if (prime) {

                    sumPrime+=number;

                } else {

                    sumNonPrime+=number;

                }


            }

        }

            System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
            System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

        }


    }





