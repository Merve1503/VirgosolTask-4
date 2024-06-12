import java.util.Arrays;

public class Task21 {

    /*
    String veya int bir değişkeni parametre olarak alan methodlar (overloading) yazalım.
    Method aldığı değişkenlerin number olan her bir karakterini bir diziye atsın.
    Ve method geriye bir int[] dizi dönsün.
    */

    public static void main(String[] args) {

        // Test için bir String ve bir int değeri belirleyelim
        String str = "12345";
        int num = 67890;

        // String ve int değerlerinin rakamlarını diziye atayan metodu çağıralım
        int[] strDigits = extractDigits(str);
        int[] numDigits = extractDigits(num);

        // Dizileri ekrana yazdıralım
        System.out.println("String rakamları: " + Arrays.toString(strDigits));
        System.out.println("Int rakamları: " + Arrays.toString(numDigits));
    }

    // String bir değişkeni parametre olarak alan ve rakamlarını diziye atan metot
    public static int[] extractDigits(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String ifade null olamaz");
        }

        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    // int bir değişkeni parametre olarak alan ve rakamlarını diziye atan metot
    public static int[] extractDigits(int num) {
        String strNum = String.valueOf(num);
        return extractDigits(strNum);
    }
}
