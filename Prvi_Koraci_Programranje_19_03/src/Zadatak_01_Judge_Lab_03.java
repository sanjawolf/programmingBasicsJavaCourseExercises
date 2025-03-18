import java.util.Scanner;

public class Zadatak_01_Judge_Lab_03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int duzina=Integer.parseInt(sc.nextLine());
        int sirina=Integer.parseInt(sc.nextLine());

        int povrsina=duzina*sirina;

        System.out.print(povrsina);
    }
}
