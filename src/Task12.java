import java.util.Arrays;

public class Task12 {

    /*
    12) Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] originalArray = {3, 5, 7, 2, 8, 4, 10, 12};

        // Belirli bir aralıktaki elemanları kopyalayan metodu çağırın
        int startIndex = 2;
        int endIndex = 5;
        int[] copiedArray = copyArrayInRange(originalArray, startIndex, endIndex);

        // Kopyalanan diziyi ekrana yazdırın
        System.out.println("Kopyalanan dizi: " + Arrays.toString(copiedArray));
    }

    // Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan metod
    public static int[] copyArrayInRange(int[] array, int startIndex, int endIndex) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Geçersiz aralık");
        }

        int[] copiedArray = new int[endIndex - startIndex + 1]; // Yeni dizi oluştur
        for (int i = startIndex, j = 0; i <= endIndex; i++, j++) {
            copiedArray[j] = array[i]; // Belirtilen aralıktaki elemanları yeni diziye kopyala
        }
        return copiedArray;

    }
}
