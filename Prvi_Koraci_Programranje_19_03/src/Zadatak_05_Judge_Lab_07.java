import java.util.Scanner;

public class Zadatak_05_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        int numberOfProjects=Integer.parseInt(sc.next());

        int preparationOfAProject=3;

        int hours=numberOfProjects*preparationOfAProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours ,numberOfProjects);

    }
}
