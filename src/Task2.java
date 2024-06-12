public class Task2 {

    /*
    2) Bir dizi oluşturun ve bu dizinin elemanlarını ters sırayla ekrana yazdırın.
     */

    public static void main(String[] args) {

        // Bir dizi oluşturun
        int[] numbers = {1, 2, 3, 4, 5};

        // Dizinin elemanlarını ters sırayla ekrana yazdırın
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
