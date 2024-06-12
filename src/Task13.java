import java.util.Arrays;

public class Task13 {

    /*
    13) Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] originalArray = {3, 5, 7, 2, 8, 4, 10, 12};

        // Çift sayıları bulan ve yeni diziye ekleyen metodu çağırın
        int[] evenNumbersArray = findEvenNumbers(originalArray);

        // Yeni diziyi ekrana yazdırın
        System.out.println("Çift sayılar: " + Arrays.toString(evenNumbersArray));
    }

    // Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen metod
    public static int[] findEvenNumbers(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int count = 0;
        // Öncelikle kaç tane çift sayı olduğunu bulalım
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        // Çift sayıları tutacak yeni bir dizi oluşturalım
        int[] evenNumbersArray = new int[count];
        int index = 0;

        // Çift sayıları yeni diziye ekleyelim
        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbersArray[index] = number;
                index++;
            }
        }

        return evenNumbersArray;
    }
}
