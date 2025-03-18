import java.util.Scanner;

public class Zadatak_94_Practice_94 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int length=Integer.parseInt(sc.nextLine());
        int width=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        double percentage=Double.parseDouble(sc.nextLine());

        double aquariumVolume=length*height*width;
        double occupiedVolume=percentage*aquariumVolume/100;
        double waterVolume=aquariumVolume-occupiedVolume;
        double waterVolumeInDmCube=waterVolume/1000;
        System.out.println(waterVolumeInDmCube);

    }
}
