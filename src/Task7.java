import java.util.Arrays;

public class Task7 {

    /*
    7) Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Diziyi küçükten büyüğe sıralayan metodu çağırın
        sortArray(numbers);

        // Sıralanmış diziyi ekrana yazdırın
        System.out.println("Sıralanmış dizi: " + Arrays.toString(numbers));
    }

    // Bir dizinin elemanlarını küçükten büyüğe sıralayan metod
    public static void sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        Arrays.sort(array); // Dizi elemanlarını küçükten büyüğe sıralar

    }
}
