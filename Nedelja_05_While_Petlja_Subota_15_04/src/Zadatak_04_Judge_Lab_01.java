import java.util.Scanner;

public class Zadatak_04_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        String nazivGrada=sc.nextLine();
//
//        while(!nazivGrada.equals("Stop")){
//
//            nazivGrada=sc.nextLine();
//        }

        while(true){

            String text=sc.nextLine();

            if(!text.equals("Stop")){

                System.out.println(text);

            }

            else{

                break;
            }

        }
    }
}
