//Importerer scanner, der skal give bruger input
import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        //Bruger funktionen Math.Random til at lave et nummer, der skal gættes
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Gæt et tal mellem 0 - 100");
    }
}
