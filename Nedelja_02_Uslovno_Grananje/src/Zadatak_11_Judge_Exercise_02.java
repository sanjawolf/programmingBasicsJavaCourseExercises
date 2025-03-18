import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        double bonusPoints=0;
        int additionalBonusPoints=0;

        if(number<=100){

            bonusPoints=5;
        }

        if(number>100 && number<=1000){

            bonusPoints=0.2*number;
        }

        if(number>1000){

            bonusPoints=0.1*number;
        }

        if(number%2==0){

            additionalBonusPoints=1;
        }

        if(number%10==5){

            additionalBonusPoints=2;
        }

        double bonusPointsTotal=bonusPoints+additionalBonusPoints;
        double totalPointsNumber=number+bonusPoints+additionalBonusPoints;
        System.out.printf("%.1f\n", bonusPointsTotal);
        System.out.printf("%.1f", totalPointsNumber);
    }
}
