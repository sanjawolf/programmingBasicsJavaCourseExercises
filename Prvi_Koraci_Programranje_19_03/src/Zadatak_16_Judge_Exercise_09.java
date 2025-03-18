import java.util.Scanner;

public class Zadatak_16_Judge_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        int width=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        double percentage=Double.parseDouble(sc.nextLine());

        int volume=length*width*height;
        double sandPlantsHeaterPump=percentage*volume/100;

        double litersOfWaterAquariumContains=(volume-sandPlantsHeaterPump)/1000;

        System.out.println(litersOfWaterAquariumContains);
    }
}
