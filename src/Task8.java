import java.util.Arrays;
import java.util.Collections;

public class Task8 {

    /*
    8) Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        Integer[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Diziyi büyükten küçüğe sıralayan metodu çağırın
        sortArrayDescending(numbers);

        // Sıralanmış diziyi ekrana yazdırın
        System.out.println("Sıralanmış dizi: " + Arrays.toString(numbers));
    }

    // Bir dizinin elemanlarını büyükten küçüğe sıralayan metod
    public static void sortArrayDescending(Integer[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        Arrays.sort(array, Collections.reverseOrder()); // Dizi elemanlarını büyükten küçüğe sıralar
    }
}
