import java.util.Scanner;

public class Zadatak_08_Unos_Brojeva {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Unesi broj: ");
        String brojKaoString=sc.nextLine();
        System.out.println("Uneli ste broj: "+brojKaoString);

        int brojKaoInteger=Integer.parseInt(brojKaoString);

        System.out.println("Desetostruka vrednost unetog broja je: "+brojKaoInteger*10);
    }
}
