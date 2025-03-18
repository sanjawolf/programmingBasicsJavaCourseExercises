import java.util.Scanner;

public class Zadatak_28_Practice_28 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        int i;

        for(i=0; i<text.length(); i++){

            char character=text.charAt(i);
            System.out.printf("%c\n", character);
        }
    }
}
