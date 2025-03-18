import java.util.Scanner;

public class Zadatak_04_Preliminary_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfGroups=Integer.parseInt(sc.nextLine());
        int i;
        int numberOfPeopleMakalu=0;
        int numberOfPeopleMontBlanc=0;
        int numberOfPeopleKilimanjaro=0;
        int numberOfPeopleK2=0;
        int numberOfPeopleEverest=0;
        int numberOfPeopleTotal=0;

        for(i=1; i<=numberOfGroups; i++){

            int numberOfPeopleInGroup=Integer.parseInt(sc.nextLine());

            numberOfPeopleTotal+=numberOfPeopleInGroup;

            if(numberOfPeopleInGroup<=5){

                numberOfPeopleMakalu+=numberOfPeopleInGroup;

            }

            else if(numberOfPeopleInGroup<=12){

                numberOfPeopleMontBlanc+=numberOfPeopleInGroup;

            }

            else if(numberOfPeopleInGroup<=25){

                numberOfPeopleKilimanjaro+=numberOfPeopleInGroup;

            }

            else if(numberOfPeopleInGroup<=40){

                numberOfPeopleK2+=numberOfPeopleInGroup;

            }

            else{

                numberOfPeopleEverest+=numberOfPeopleInGroup;

            }
        }

        double percentageMakalu=100.00*numberOfPeopleMakalu/numberOfPeopleTotal;
        double percentageMontBlanc=100.00*numberOfPeopleMontBlanc/numberOfPeopleTotal;
        double percentageKilimanjaro=100.00*numberOfPeopleKilimanjaro/numberOfPeopleTotal;
        double percentageK2=100.00*numberOfPeopleK2/numberOfPeopleTotal;
        double percentageEverest=100.00*numberOfPeopleEverest/numberOfPeopleTotal;

        System.out.printf("%.2f%%\n", percentageMakalu);
        System.out.printf("%.2f%%\n", percentageMontBlanc);
        System.out.printf("%.2f%%\n", percentageKilimanjaro);
        System.out.printf("%.2f%%\n", percentageK2);
        System.out.printf("%.2f%%\n", percentageEverest);


    }
}
