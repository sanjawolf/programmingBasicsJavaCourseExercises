import java.util.Scanner;

public class Zadatak_06_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfFloors=Integer.parseInt(sc.nextLine());
        int numberOfRoomsPerFloor=Integer.parseInt(sc.nextLine());

        int floorNumber, apartmentNumber;

        for(floorNumber=numberOfFloors; floorNumber>=1; floorNumber--){

            for (apartmentNumber=0; apartmentNumber<=numberOfRoomsPerFloor-1;apartmentNumber++){

                if(floorNumber%2==0) {

                    if (floorNumber == numberOfFloors || numberOfFloors == 1) {

                        System.out.printf("L%d%d ", floorNumber, apartmentNumber);
                    } else {

                        System.out.printf("O%d%d ", floorNumber, apartmentNumber);
                    }

                }

                else{

                    if(floorNumber==numberOfFloors || numberOfFloors==1){

                        System.out.printf("L%d%d ", floorNumber, apartmentNumber);
                    }

                    else{

                        System.out.printf("A%d%d ", floorNumber, apartmentNumber);
                    }
                }

            }

            System.out.println();

            }
        }
    }

