import java.util.Arrays;

public class Task20 {

    /*
    20) String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir method yazın.
    Method parametre olarak String almalı, return olarak dizi dönmeli.
    */

    public static void main(String[] args) {

        // Test için bir String ifade oluşturun
        String str = "Merve";

        // String ifadenin karakterlerini diziye aktaran metodu çağırın
        char[] charArray = stringToCharArray(str);

        // Diziyi ekrana yazdırın
        System.out.println("Karakter dizisi: " + Arrays.toString(charArray));
    }

    // String ifadenin tüm karakterlerini bir diziye aktaran metod
    public static char[] stringToCharArray(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String ifade null olamaz");
        }

        char[] charArray = new char[str.length()];

        // String ifadenin karakterlerini diziye aktar
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }
}
