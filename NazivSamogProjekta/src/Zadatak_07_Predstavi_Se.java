import java.util.Scanner;

public class Zadatak_07_Predstavi_Se {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Unesite ime, prezime i grad iz kog ste: ");

        String ime=scanner.nextLine();

        String prezime=scanner.nextLine();

        String grad=scanner.nextLine();

        System.out.println(ime+" "+prezime+" poreklom iz "+grad);

    }
}
