import java.util.Scanner;

public class Zadatak_57_Practice_57 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        if (!(number<=200 && number>=100 || number==0)){

            System.out.println("invalid");
        }
    }
}
