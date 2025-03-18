import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String actorsName=sc.nextLine();
        double academyPoints=Double.parseDouble(sc.nextLine());
        int numberOfEvaluators=Integer.parseInt(sc.nextLine());

        int i;
        double actorsPoints=-1;
        double pointsWithoutAcademy=0;

        for(i=1; i<=numberOfEvaluators; i++){

            String nameOfEvaluator=sc.nextLine();
            double evaluatorPoints=Double.parseDouble(sc.nextLine());
            actorsPoints=nameOfEvaluator.length()*evaluatorPoints/2;
            pointsWithoutAcademy=pointsWithoutAcademy+actorsPoints;

            double points=pointsWithoutAcademy+academyPoints;

            if(points>1250.5){

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, points);
                return;
            }


        }

        double points=pointsWithoutAcademy+academyPoints;
        double difference=1250.5-points;
        System.out.printf("Sorry, %s you need %.1f more!", actorsName, difference);



    }
}
