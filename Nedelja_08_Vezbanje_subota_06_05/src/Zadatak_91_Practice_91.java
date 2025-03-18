import java.util.Scanner;

public class Zadatak_91_Practice_91 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int annualFeeForBasketballTraining=Integer.parseInt(sc.nextLine());

        double basketballSneakers=0.6*annualFeeForBasketballTraining;
        double basketballOutfit=0.8*basketballSneakers;
        double ball=basketballOutfit/4;
        double basketballAccessories=ball/5;

        double costs=annualFeeForBasketballTraining+ball+basketballAccessories+basketballOutfit+basketballSneakers;
        System.out.println(costs);


    }
}
