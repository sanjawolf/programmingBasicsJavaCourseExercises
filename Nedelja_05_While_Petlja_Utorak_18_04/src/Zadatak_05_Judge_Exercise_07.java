import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int widthOfFreeSpace=Integer.parseInt(sc.nextLine());
        int lengthOfFreeSpace=Integer.parseInt(sc.nextLine());
        int heightOfFreeSpace=Integer.parseInt(sc.nextLine());

        int volumeOfFreeSpace=widthOfFreeSpace*lengthOfFreeSpace*heightOfFreeSpace;

        while(true){

            String numberOfBoxesText= sc.nextLine();

            if(numberOfBoxesText.equals("Done") && volumeOfFreeSpace>0){

                int restOfFreeSpace=volumeOfFreeSpace;
                System.out.printf("%d Cubic meters left.", restOfFreeSpace);
                break;
            }

            int numberOfBoxes=Integer.parseInt(numberOfBoxesText);

            volumeOfFreeSpace=volumeOfFreeSpace-numberOfBoxes;

            if(volumeOfFreeSpace<=0){

                int missingCubicMeters=Math.abs(volumeOfFreeSpace);
                System.out.printf("No more free space! You need %d Cubic meters more.", missingCubicMeters);
                return;
            }
        }

    }
}
