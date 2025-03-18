import java.util.Scanner;

public class Zadatak_36_Practice_36 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfFloors=Integer.parseInt(sc.nextLine());
        int numberOfRoomsPerFloor=Integer.parseInt(sc.nextLine());
        int floor, room;

        for(floor=numberOfFloors; floor>=1; floor--) {

            for (room = 0; room < numberOfRoomsPerFloor; room++) {

                if (floor == numberOfFloors) {

                    if (floor % 2 == 0) {

                        System.out.printf("L%d%d ", floor, room);

                    } else {

                        System.out.printf("L%d%d ", floor, room);
                    }


                } else {

                    if (floor % 2 == 0) {

                        System.out.printf("O%d%d ", floor, room);

                    } else {

                        System.out.printf("A%d%d ", floor, room);
                    }


                }



            }

            System.out.println();

        }

        }
    }

