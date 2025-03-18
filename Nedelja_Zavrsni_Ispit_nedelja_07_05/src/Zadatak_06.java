import java.util.Scanner;

public class Zadatak_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int beginningOfRange=Integer.parseInt(sc.nextLine());

        int thousandsBegin=beginningOfRange/1000;
        int hundreadsBegin=beginningOfRange/100%10;
        int tensBegin=beginningOfRange/10%10;
        int onesBegin=beginningOfRange%10;

        int endOfRange=Integer.parseInt(sc.nextLine());

        int thousandsEnd=endOfRange/1000;
        int hundreadsEnd=endOfRange/100%10;
        int tensEnd=endOfRange/10%10;
        int onesEnd=endOfRange%10;

        for(int thousands=thousandsBegin; thousands<=thousandsEnd; thousands++){

            for(int hundreads=hundreadsBegin; hundreads<=hundreadsEnd; hundreads++){

                for(int tens=tensBegin; tens<=thousandsEnd; tens++){

                    for(int ones=onesBegin; ones<=onesBegin; ones++){

                        if(thousands%2!=0 && hundreads%2!=0 && tens%2!=0 && ones%2!=0){

                            System.out.printf("%d%d%d%d ", thousands, hundreads, tens, ones);
                        }
                    }
                }
            }
        }



    }
}
