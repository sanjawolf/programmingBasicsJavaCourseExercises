import java.util.Scanner;

public class Zadatak_37_Practice_37 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nameOfArchitect=sc.nextLine();
        int numberOfProjectsPrepared=Integer.parseInt(sc.nextLine());
        int HOURS_ONE_PROJECT=3;

        int hours=numberOfProjectsPrepared*HOURS_ONE_PROJECT;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameOfArchitect, hours, numberOfProjectsPrepared);

    }
}
