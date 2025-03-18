import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        int i;

        for(i=1111; i<=9999; i++){

            int jedinice=i%10;
            int desetice=i%100/10;
            int stotine=i%1000/100;
            int hiljade=i/1000;

            if(hiljade!=0 && desetice!=0 && stotine!=0 && jedinice!=0) {

                if (N % jedinice == 0 && N % desetice == 0 && N % stotine == 0 && N % hiljade == 0) {

                    System.out.printf("%d%d%d%d ", hiljade, stotine, desetice, jedinice);
                }

            }
        }
    }
}
