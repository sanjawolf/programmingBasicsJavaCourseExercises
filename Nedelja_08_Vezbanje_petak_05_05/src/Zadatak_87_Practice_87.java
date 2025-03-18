import java.util.Scanner;

public class Zadatak_87_Practice_87 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());
        int length=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());

        int volume=width*length*height;

        while(true){

            String numberOfBoxesText=sc.nextLine();

            if(numberOfBoxesText.equals("Done")){

                System.out.printf("%d Cubic meters left.", volume);
                return;
            }

            int numberOfBoxes=Integer.parseInt(numberOfBoxesText);

            volume-=numberOfBoxes;

            if(volume<=0){

                break;
            }


        }

            volume=Math.abs(volume);

            System.out.printf("No more free space! You need %d Cubic meters more.", volume);




    }
}
