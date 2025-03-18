import java.util.Scanner;

public class Zadatak_50_Practice_50 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        double bonusPoints=-1;
        double additionalPoints=-1;

        if(number<=100){

            bonusPoints=5;

        }

        else if(number<=1000){

            bonusPoints=0.2*number;
        }

        else{

            bonusPoints=0.1*number;
        }

        if(number%2==0){

            additionalPoints=1;
        }

        else if(number%10==5){

            additionalPoints=2;
        }

        else{

            additionalPoints=0;
        }

        double bonusPointsTotal=bonusPoints+additionalPoints;
        double totalPoints=number+bonusPointsTotal;
        System.out.println(bonusPointsTotal);
        System.out.println(totalPoints);
    }
}
