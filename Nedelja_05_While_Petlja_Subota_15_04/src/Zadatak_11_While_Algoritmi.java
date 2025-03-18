import java.util.Scanner;

public class Zadatak_11_While_Algoritmi {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sum=0;
        int brojac=0;
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while(true){

            String numberText=sc.nextLine();

            if(numberText.equals("Kraj unosa")){

                break;
            }

            int number=Integer.parseInt(numberText);

//            if(number<0) {
//
//                break;
//
//            }

            if(number<5){

                sum=sum+number;
            }

            if(number%3==0){

                brojac=brojac+1;

            }

            if(number>max){

                max=number;
            }

            if(number<min){

                min=number;
            }
        }

        System.out.println(sum);
        System.out.println(brojac);
        System.out.println(max);
        System.out.println(min);
    }
}
