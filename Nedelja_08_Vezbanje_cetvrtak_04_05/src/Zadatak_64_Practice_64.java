import java.util.Scanner;

public class Zadatak_64_Practice_64 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        for(int i=1; i<=1000; i++){

            int poslednjaCifra=i%10;

            if(poslednjaCifra==7){

                System.out.println(i);
            }
        }
    }
}
