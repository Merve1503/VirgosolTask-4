import java.util.Arrays;

public class Task11 {

    /*
    11) Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] originalArray = {3, 5, 7, 2, 8};

        // Diziyi kopyalayan metodu çağırın
        int[] copiedArray = copyArray(originalArray);

        // Kopyalanan diziyi ekrana yazdırın
        System.out.println("Kopyalanan dizi: " + Arrays.toString(copiedArray));
    }

    // Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan metod
    public static int[] copyArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int[] copiedArray = new int[array.length]; // Yeni dizi oluştur
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i]; // Orjinal dizinin elemanlarını yeni diziye kopyala
        }
        return copiedArray;
    }
}
