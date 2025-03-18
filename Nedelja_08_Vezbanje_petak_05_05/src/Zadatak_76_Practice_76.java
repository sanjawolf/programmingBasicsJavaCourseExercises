import java.util.Scanner;

public class Zadatak_76_Practice_76 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int counterSmaller200=0;
        int counterSmaller399=0;
        int counterSmaller599=0;
        int counterSmaller799=0;
        int counterGreater800=0;

        for(int i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());


            if(number<200){

                counterSmaller200++;

            }

            else if(number<=399){

                counterSmaller399++;

            }

            else if(number<=599){

                counterSmaller599++;

            }

            else if(number<=799){

               counterSmaller799++;

            }

            else{

                counterGreater800++;

            }


        }

        double p1=100.00*counterSmaller200/n;
        double p2=100.00*counterSmaller399/n;
        double p3=100.00*counterSmaller599/n;
        double p4=100.00*counterSmaller799/n;
        double p5=100.00*counterGreater800/n;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
