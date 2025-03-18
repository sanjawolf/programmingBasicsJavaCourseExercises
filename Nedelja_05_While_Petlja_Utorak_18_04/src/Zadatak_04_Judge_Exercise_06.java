import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());
        int length=Integer.parseInt(sc.nextLine());
        int surface=width*length;

        while(true) {

            String string = sc.nextLine();

            if (string.equals("STOP")){

                break;

            }

            int numberОfPiecesGuestsTake=Integer.parseInt(string);

            surface=surface-numberОfPiecesGuestsTake;

            int theRestOfCake=surface;

            if(theRestOfCake<0){

                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(theRestOfCake));
                return;
            }
        }

        int numberОfPiecesGuestsTake=surface;
        System.out.printf("%d pieces are left.", numberОfPiecesGuestsTake);


    }
}
