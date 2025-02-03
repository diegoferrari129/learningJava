/*
 * Primitivi (iniziano con la lettera minuscola)
 * boolean, char(singolo apice), byte, short, int, long(finisce sempre con L), float(finisce sempre con f), double
 * 
 * Reference (iniziano con la lettera maiuscola e portano con se una seria di metodi e attributi che possiamo utilizzare e possiamo costruirle noi)
 * String(doppi apici)
 */
public class DataType {
    public static void main(String[] args) {
        boolean light = true;

        char letter = 'A';
        char number = '1';

        byte age = 127;
        short typeShort = 32767;
        int typeInt = 2147483647;
        long typeLong = 9223372036854775807L;

        float typeFloat = 3.14f;
        double typeDouble = 3.14d;

        String name = "Diego";
        System.out.println(name.toUpperCase());
    }
}