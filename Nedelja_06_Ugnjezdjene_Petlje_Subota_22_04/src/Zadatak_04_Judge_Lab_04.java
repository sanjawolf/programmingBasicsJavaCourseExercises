import java.util.Scanner;

public class Zadatak_04_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int pocetak=Integer.parseInt(sc.nextLine());
        int kraj=Integer.parseInt(sc.nextLine());
        int magicniBroj=Integer.parseInt(sc.nextLine());
        int numberOfCombination=0;
        boolean flag=false;
        int i, j;

        for(i=pocetak; i<=kraj; i++){

            for(j=pocetak; j<=kraj; j++) {

                int sum = i + j;
                numberOfCombination++;

                if (sum == magicniBroj) {

                    System.out.printf("Combination N:%d (%d + %d = %d)", numberOfCombination, i, j, sum);
                    flag = true;
                    return;
                }


            }

                if(flag){


                    break;
                }

        }

        System.out.printf("%d combinations - neither equals %d", numberOfCombination, magicniBroj);

    }
}
