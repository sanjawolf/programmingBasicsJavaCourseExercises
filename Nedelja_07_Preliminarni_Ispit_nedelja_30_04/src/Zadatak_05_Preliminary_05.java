import java.util.Scanner;

public class Zadatak_05_Preliminary_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfSeaExcursions=Integer.parseInt(sc.nextLine());
        int numberOfMountainExcursions=Integer.parseInt(sc.nextLine());

        int EXCURSION_SEA=680;
        int EXCURSION_MOUNTAIN=499;
        int totalAmount=0;
        int counterSea=0;
        int counterMountain=0;

        while(true) {

            String packageName = sc.nextLine();

            if (packageName.equals("Stop")) {

                break;
            }

            if (packageName.equals("sea")) {

                counterSea++;

                if (numberOfSeaExcursions <= counterSea && numberOfMountainExcursions <= counterMountain) {

                    System.out.println("Good job! Everything is sold.");
                    totalAmount += EXCURSION_SEA;
                    break;

                } else {

                    if (counterSea <= numberOfSeaExcursions) {

                        totalAmount += EXCURSION_SEA;

                    }


                }


            }

            if (packageName.equals("mountain")) {

                counterMountain++;

                if (numberOfSeaExcursions <= counterSea && numberOfMountainExcursions <= counterMountain) {

                    System.out.println("Good job! Everything is sold.");
                    totalAmount += EXCURSION_MOUNTAIN;
                    break;


                } else {

                    if (counterMountain <= numberOfMountainExcursions) {

                        totalAmount += EXCURSION_MOUNTAIN;
                    }


                }


            }

        }



        System.out.printf("Profit: %d USD.", totalAmount);

    }
}
