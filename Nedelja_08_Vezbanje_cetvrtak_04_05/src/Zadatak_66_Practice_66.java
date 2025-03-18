import java.util.Scanner;

public class Zadatak_66_Practice_66 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());



        for(int i=1000; i<=9999; i++){

            String specialNumberText=i+"";

            int length=specialNumberText.length();

            boolean flag=true;

            for(int j=0; j<length; j++){

                char character=specialNumberText.charAt(j);

                int characterInt=Integer.parseInt(character+"");

                    if(characterInt==0){

                        flag=false;
                        break;
                    }

                    if(!(N%characterInt==0)){

                        flag=false;
                        break;
                    }









            }

            if(flag){

                System.out.print(specialNumberText +" ");
            }



        }




    }
}
