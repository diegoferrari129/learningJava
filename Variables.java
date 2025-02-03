/*
 * Dichiarare una variabile, assegnarne un valore e inizializzare una variabile
 * Una variabile è definita dal tipo di dato che contiene e dal nome della variabile
 * LowerCamelCase per le variabili
 * Maiuscolo con lo snake_case per le costanti
 */

public class Variables {
    public static void main(String[] args) {
        int x;
        x = 1;
        System.out.println(x);
        // oppure
        int y = 2;
        System.out.println(y);

        // cambia il valore della variabile x
        x = 3;
        System.out.println(x);

        int z = x + y;
        System.out.println(z);

        String nome = "Diego";
        double temperatura = 37.5;
        System.out.println("Ciao " + nome + ", la tua temperatura e' " + temperatura + " gradi.");
    }
}
