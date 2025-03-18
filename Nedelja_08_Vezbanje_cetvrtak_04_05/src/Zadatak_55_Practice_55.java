import java.util.Scanner;

public class Zadatak_55_Practice_55 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sumNonPrimeNumbers=0;
        int sumPrimeNumbers=0;

        while(true){

            String numberText= sc.nextLine();

            if(numberText.equals("stop")){

                break;
            }

            int number=Integer.parseInt(numberText);

            if(number<0){

                System.out.println("Number is negative.");
            }

            boolean flag=true;

            for(int i=2; i<number; i++){

                if(number%i==0 && number>0){

                    sumNonPrimeNumbers+=number;
                    flag=false;
                    break;
                }



            }

            if(flag && number>0) {

                sumPrimeNumbers += number;

            }

        }

            System.out.printf("Sum of all prime numbers is: %d\n", sumPrimeNumbers);

            System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);



    }
}
