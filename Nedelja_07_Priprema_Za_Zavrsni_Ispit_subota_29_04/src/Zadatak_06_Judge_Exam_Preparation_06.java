import java.util.Scanner;

public class Zadatak_06_Judge_Exam_Preparation_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int startOfRange=Integer.parseInt(sc.nextLine());
        int endOfRange=Integer.parseInt(sc.nextLine());
        int thousands, hundreads, tens, ones;

        int startOfRangeThousands=startOfRange/1000;
        int startOfRangeHundreads=startOfRange/100%10;
        int startOfRangeTens=startOfRange/10%10;
        int startOfRangeOnes=startOfRange%10;
        int endOfRangeThousands=endOfRange/1000;
        int endOfRangeHundreads=endOfRange/100%10;
        int endOfRangeTens=endOfRange/10%10;
        int endOfRangeOnes=endOfRange%10;


        for(thousands=startOfRangeThousands; thousands<=endOfRangeThousands; thousands++){
            for(hundreads=startOfRangeHundreads; hundreads<=endOfRangeHundreads; hundreads++){
                for(tens=startOfRangeTens; tens<=endOfRangeTens; tens++){
                    for(ones=startOfRangeOnes; ones<=endOfRangeOnes; ones++){

                        if(thousands%2!=0 && hundreads%2!=0 && tens%2!=0 && ones%2!=0){

                            System.out.printf("%d%d%d%d ", thousands, hundreads, tens, ones);
                        }

                    }
                }
            }
        }

    }
}
