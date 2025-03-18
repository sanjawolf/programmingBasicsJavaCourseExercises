import java.util.Scanner;

public class Zadatak_34_Practice_34 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        int i;
        int sum=0;

        for(i=0; i<text.length(); i++){

            char character=text.charAt(i);

            if(character=='a'){

                sum+=1;

            }

            else if(character=='e'){

                sum+=2;

            }

            else if(character=='i'){

                sum+=3;

            }

            else if(character=='o'){

                sum+=4;

            }

            else if(character=='u'){

                sum+=5;

            }

        }

        System.out.println(sum);
    }
}
