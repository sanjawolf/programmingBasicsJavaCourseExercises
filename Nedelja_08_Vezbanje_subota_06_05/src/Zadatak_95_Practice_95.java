import java.util.Scanner;

public class Zadatak_95_Practice_95 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N1=Integer.parseInt(sc.nextLine());
        int N2=Integer.parseInt(sc.nextLine());
        String operator=sc.nextLine();
//                "+", "-", "*", "/", "%"
        String evenOrOdd="";

        if(operator.equals("+")){

            int addition=N1+N2;

            if(addition%2==0){

                evenOrOdd="even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, addition, evenOrOdd);

            }

            else{

                evenOrOdd="odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, addition, evenOrOdd);
            }


        }

        if(operator.equals("-")){

            int substraction=N1-N2;

            if(substraction%2==0){

                evenOrOdd="even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, substraction, evenOrOdd);

            }

            else{

                evenOrOdd="odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, substraction, evenOrOdd);
            }


        }

        if(operator.equals("*")){

            int multiplication=N1*N2;

            if(multiplication%2==0){

                evenOrOdd="even";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, multiplication, evenOrOdd);

            }

            else{

                evenOrOdd="odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, multiplication, evenOrOdd);
            }


        }

        if(operator.equals("/")) {

            if (N2 == 0) {

                System.out.printf("Cannot divide %d by zero", N1);
            } else {

                double division = (double)N1 / N2;

                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, division);

            }

        }

            if(operator.equals("%")){

                if(N2==0){

                    System.out.printf("Cannot divide %d by zero", N1);
                }

                else{

                    int divisionByR=N1%N2;

                        System.out.printf("%d %s %d = %d", N1, operator, N2, divisionByR);
                }


            }
    }
}
