import java.util.Arrays;

public class Task16 {

    /*
    16) İki diziyi birleştiren ve yeni bir dizi oluşturan bir metod yazın.
    (ipucu: method iki adet parametre (int[] dizi1, int[] dizi2) alıyor)
    */

    public static void main(String[] args) {

        // Test için iki dizi oluşturun
        int[] array1 = {3, 5, 7};
        int[] array2 = {2, 8, 4, 10};

        // İki diziyi birleştiren metodu çağırın
        int[] mergedArray = mergeArrays(array1, array2);

        // Yeni diziyi ekrana yazdırın
        System.out.println("Birleştirilmiş dizi: " + Arrays.toString(mergedArray));
    }

    // İki diziyi birleştiren ve yeni bir dizi oluşturan metod
    public static int[] mergeArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Diziler null olamaz");
        }

        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];

        // İlk diziyi yeni diziye kopyala
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // İkinci diziyi yeni diziye kopyala
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        return mergedArray;
    }
}
