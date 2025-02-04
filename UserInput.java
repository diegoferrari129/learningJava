/*importo lo scanner dall'utility di java per poterlo richiamare 
 * creo l'oggetto scanner
*/

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String name = scanner.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String surname = scanner.nextLine();

        System.out.println("Ciao: " + name + " " + surname + "!");
    }
}
