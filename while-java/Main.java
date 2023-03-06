//Teste mesa
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = 2002;

        while(x != y ){
            System.out.println("Senha Inválida " + x);

            x = sc.nextInt();
        }

        System.out.println("Senha correta " + y);

        sc.close();
    }

}
