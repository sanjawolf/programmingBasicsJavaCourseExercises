import java.util.Scanner;

public class Zadatak_02_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int age=Integer.parseInt(sc.nextLine());
        double washingMachinePrice=Double.parseDouble(sc.nextLine());
        int singleToyPrice=Integer.parseInt(sc.nextLine());
        double money=0;

        int i;

        for(i=1; i<=age; i++){

            if(i%2==0){

                money=money+i/2.0*10-1;
            }

            else{

                money=money+singleToyPrice;
            }

        }

        if(money>=washingMachinePrice){

            double difference=money-washingMachinePrice;
            System.out.printf("Yes! %.2f", difference);
        }

        else{
            double difference=washingMachinePrice-money;
            System.out.printf("No! %.2f", difference);
        }
    }
}
