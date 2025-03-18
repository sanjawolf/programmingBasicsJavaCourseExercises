import java.util.Scanner;

public class Zadatak_08_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        int sum=0;
        int i;

        for(i=0; i<=string.length()-1; i++){

            char character=string.charAt(i);

            if(character=='a') {

                sum = sum + 1;

            }

            if(character=='e') {

                sum = sum + 2;

            }

            if(character=='i') {

                sum = sum + 3;

            }

            if(character=='o') {

                sum = sum + 4;

            }

            if(character=='u') {

                sum = sum + 5;

            }
//            switch(character){
//
//                case 'a':
//                    sum=sum+1;
//                    break;
//
//                case 'e':
//                    sum=sum+2;
//                    break;
//
//                case 'i':
//                    sum=sum+3;
//                    break;
//
//                case 'o':
//                    sum=sum+4;
//                    break;
//
//                case 'u':
//                    sum=sum+5;
//
//                default:
//            }
            }

        System.out.println(sum);
    }
}
