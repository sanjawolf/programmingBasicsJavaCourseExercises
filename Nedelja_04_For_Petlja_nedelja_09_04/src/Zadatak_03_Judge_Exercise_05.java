import java.util.Scanner;

public class Zadatak_03_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int openTabsNumber=Integer.parseInt(sc.nextLine());
        int salary=Integer.parseInt(sc.nextLine());

        int i;
        int openTabsNumberFacebook=0;
        int openTabsNumberInstagram=0;
        int openTabsNumberReddit=0;

        for(i=1; i<=openTabsNumber; i++){

            String websiteName=sc.nextLine();

            switch(websiteName){

                case "Facebook":
                    openTabsNumberFacebook=openTabsNumberFacebook+1;
                    break;

                case "Instagram":
                    openTabsNumberInstagram=openTabsNumberInstagram+1;
                    break;

                case "Reddit":
                    openTabsNumberReddit=openTabsNumberReddit+1;
                    break;

                default:

            }

        }

        int fines=openTabsNumberFacebook*150+openTabsNumberInstagram*100+openTabsNumberReddit*50;

        if(salary<=fines){

            System.out.println("You have lost your salary." );
        }

        else{

            int difference=salary-fines;
            System.out.println(difference);
        }



    }
}
