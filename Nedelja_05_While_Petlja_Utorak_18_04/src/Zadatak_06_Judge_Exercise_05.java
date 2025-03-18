import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double amount=Double.parseDouble(sc.nextLine());
        amount=amount*1000;
        int numberOfCoins=0;

        while(amount!=0){

            if(amount>=2000){

                amount=amount-2000;
                numberOfCoins++;
            }

            else if(amount>=1000){

                amount=amount-1000;
                numberOfCoins++;
            }

            else if(amount>=500){

                amount=amount-500;
                numberOfCoins++;
            }

            else if(amount>=200){

                amount=amount-200;
                numberOfCoins++;
            }

            else if(amount>=100){

                amount=amount-100;
                numberOfCoins++;
            }

            else if(amount>=50){

                amount=amount-50;
                numberOfCoins++;
            }

            else if(amount>=20){

                amount=amount-20;
                numberOfCoins++;
            }

            else if(amount>=10){

                amount=amount-10;
                numberOfCoins++;
            }
        }

        System.out.println(numberOfCoins);
    }
}
