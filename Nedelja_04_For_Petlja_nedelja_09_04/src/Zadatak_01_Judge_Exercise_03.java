import java.util.Scanner;

public class Zadatak_01_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i;
        int counterBelow200=0;
        int counterBetween200And399=0;
        int counterBetween400And599=0;
        int counterBetween600And799=0;
        int counterAbove800=0;

        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if(number<200){

                counterBelow200=counterBelow200+1;

            }

            else if(number<=399){

                counterBetween200And399=counterBetween200And399+1;
            }

            else if(number<=599){

                counterBetween400And599=counterBetween400And599+1;
            }

            else if(number<=799){

                counterBetween600And799=counterBetween600And799+1;

            }

            else{

                counterAbove800=counterAbove800+1;

            }
        }

        double percent1=counterBelow200*100.0/n;
        double percent2=counterBetween200And399*100.0/n;
        double percent3=counterBetween400And599*100.0/n;
        double percent4=counterBetween600And799*100.0/n;
        double percent5=counterAbove800*100.0/n;

        System.out.printf("%.2f%%\n", percent1);
        System.out.printf("%.2f%%\n", percent2);
        System.out.printf("%.2f%%\n", percent3);
        System.out.printf("%.2f%%\n", percent4);
        System.out.printf("%.2f%%", percent5);
    }
}
