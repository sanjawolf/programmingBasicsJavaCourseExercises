import java.util.Scanner;

public class Zadatak_48_Practice_48_preko_stringa {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOne=Integer.parseInt(sc.nextLine());
        int numberTwo=Integer.parseInt(sc.nextLine());

        int i;

        for(i=numberOne; i<=numberTwo; i++) {

            String numberText = i + "";
            int j;
            int evenDigits = 0;
            int oddDigits = 0;

            for (j = 0; j < numberText.length(); j++) {

                char numberTextChar = numberText.charAt(j);
                int numberDigit = Integer.parseInt(numberTextChar + "");

                if (j % 2 == 0) {

                    evenDigits += numberDigit;

                } else {

                    oddDigits += numberDigit;

                }

            }

            if(evenDigits==oddDigits){

                System.out.print(numberText+" ");
            }

        }












        }


    }
