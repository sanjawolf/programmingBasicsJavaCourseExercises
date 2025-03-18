import java.util.Scanner;

public class Zadatak_01_Preliminary_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfBitcoins=Integer.parseInt(sc.nextLine());
        double numberOfChineseYuan=Double.parseDouble(sc.nextLine());
        double commission=Double.parseDouble(sc.nextLine());

        int BITCOIN = 1168;
        double CHINESE_YUAN = 0.15;
        double USD = 1.76;
        double EURO = 1.95;

        double bitcoinInEuros=numberOfBitcoins*BITCOIN/EURO;
        double chineseYuanInRSD=numberOfChineseYuan*CHINESE_YUAN*USD;
        double chineseYuanInEuros=chineseYuanInRSD/EURO;

        double euros=(bitcoinInEuros+chineseYuanInEuros)*(1-commission/100);

        System.out.printf("%.2f", euros);


    }
}
