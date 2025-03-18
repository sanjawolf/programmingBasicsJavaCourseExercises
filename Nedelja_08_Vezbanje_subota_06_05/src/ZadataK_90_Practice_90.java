import java.util.Scanner;

public class ZadataK_90_Practice_90 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String actorsName=sc.nextLine();
        double pointsFromAcademy=Double.parseDouble(sc.nextLine());
        int numberOfEvaluators=Integer.parseInt(sc.nextLine());
        double actorsPoints=-1;
        double result=0;

        for(int i=1; i<=numberOfEvaluators; i++){

            String nameOfEvaluator=sc.nextLine();
            double evaluatorPoints=Double.parseDouble(sc.nextLine());
            int length=nameOfEvaluator.length();
            actorsPoints=length*evaluatorPoints/2;
            result+=pointsFromAcademy+actorsPoints;


            if(result>1250.5){

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, result);
                return;
            }

            pointsFromAcademy=0;

        }

            double difference=1250.5-result;
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, difference);


    }
}
