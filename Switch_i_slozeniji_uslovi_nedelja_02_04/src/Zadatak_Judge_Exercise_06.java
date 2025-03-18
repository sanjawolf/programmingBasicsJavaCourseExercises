import java.util.Scanner;

public class Zadatak_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N1 = Integer.parseInt(sc.nextLine());
        int N2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int remainder=-1;

        if(operator.equals("+")){

            int addition = N1 + N2;

            if (addition % 2 == 0) {

                System.out.printf("%d %s %d = %d - even", N1, operator, N2, addition);

            } else {

                System.out.printf("%d %s %d = %d - odd", N1, operator, N2, addition);
            }


        }


        if(operator.equals("-")){

            int substraction = N1 - N2;

            if (substraction % 2 == 0) {

                System.out.printf("%d %s %d = %d - even", N1, operator, N2, substraction);

            } else {

                System.out.printf("%d %s %d = %d - odd", N1, operator, N2, substraction);
            }

        }

        if(operator.equals(("*"))){

            int multiplication = N1 * N2;

            if (multiplication % 2 == 0) {

                System.out.printf("%d %s %d = %d - even", N1, operator, N2, multiplication);

            } else {

                System.out.printf("%d %s %d = %d - odd", N1, operator, N2, multiplication);
            }
        }

        if(operator.equals("/")){

            double wholeDivision = (double) N1 / N2;

            if (N2 == 0) {

                System.out.printf("Cannot divide %d by zero", N1);

            } else {

                System.out.printf("%d %s %d = %.2f", N1, operator, N2, wholeDivision);

            }

        }

        if(operator.equals("%")){

            if (N2 == 0) {

                System.out.printf("Cannot divide %d by zero", N1);

            } else {

                remainder=N1%N2;

                System.out.printf("%d %s %d = %d", N1, operator, N2, remainder);

            }
        }

        }

    }



