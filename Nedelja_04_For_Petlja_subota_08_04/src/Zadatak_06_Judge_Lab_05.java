import java.util.Scanner;

public class Zadatak_06_Judge_Lab_05 {

    public static void main(String[] args) {

//        String string="Harel";

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        int i;

        for(i=0; i<=string.length()-1; i++){

            char karakter=string.charAt(i);
            System.out.println(karakter);
        }
    }
}
