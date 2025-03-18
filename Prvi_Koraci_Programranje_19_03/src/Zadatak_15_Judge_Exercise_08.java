import java.util.Scanner;

public class Zadatak_15_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int annualFee=Integer.parseInt(sc.nextLine());

        double basketballSneakers=60.0*annualFee/100;
        double basketballOutfit=80*basketballSneakers/100;
        double ball=basketballOutfit/4;
        double basketballAccessories=ball/5;

        double costs=annualFee+basketballSneakers+basketballOutfit+ball+basketballAccessories;

        System.out.printf("%.2f",costs);

    }
}
