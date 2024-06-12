import java.util.Arrays;

public class Task19 {

    /*
    19) Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metod yazın.
    (ipucu: yeni dizinin boyutu bir azalmalı)
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] array = {3, 5, 7, 2, 8};

        // Belirli bir elemanı silen metodu çağırın
        int target = 7;
        int[] newArray = removeArrayElement(array, target);

        // Yeni diziyi ekrana yazdırın
        System.out.println("Yeni dizi: " + Arrays.toString(newArray));
    }

    // Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren metod
    public static int[] removeArrayElement(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        // Elemanın dizide kaç kez geçtiğini bulun
        int count = 0;
        for (int number : array) {
            if (number == target) {
                count++;
            }
        }

        // Yeni dizi boyutunu belirleyin
        int newSize = array.length - count;
        int[] newArray = new int[newSize];

        int index = 0;
        // Yeni diziye elemanları kopyalayın, hedef elemanı atlayın
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                newArray[index] = array[i];
                index++;
            }
        }

        return newArray;
    }
}
