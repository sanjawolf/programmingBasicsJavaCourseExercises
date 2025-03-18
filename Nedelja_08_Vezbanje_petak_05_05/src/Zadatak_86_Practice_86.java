import java.util.Scanner;

public class Zadatak_86_Practice_86 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfOpenTabs=Integer.parseInt(sc.nextLine());
	    int salary=Integer.parseInt(sc.nextLine());

        int FACEBOOK=150;
	    int INSTAGRAM=100;
	    int REDDIT=50;

        for(int i=1; i<=numberOfOpenTabs; i++){

            String nameOfWebsite=sc.nextLine();

            if(nameOfWebsite.equals("Facebook")){

                salary-=FACEBOOK;
            }

            if(nameOfWebsite.equals("Instagram")){

                salary-=INSTAGRAM;
            }

            if(nameOfWebsite.equals("Reddit")) {

                salary -= REDDIT;
            }

            if(salary==0){

                System.out.println("You have lost your salary.");
                return;
            }
        }


        System.out.printf("%d", salary);

    }
}
