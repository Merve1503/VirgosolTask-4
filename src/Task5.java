public class Task5 {

    /*
    5) Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.
     */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Dizideki elemanların toplamını bulan metodu çağırın ve sonucu ekrana yazdırın
        int sum = calculateSum(numbers);
        System.out.println("Dizideki elemanların toplamı: " + sum);
    }

    // Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan metod
    public static int calculateSum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int sum = 0; // Toplamı tutacak değişken
        for (int number : array) {
            sum += number; // Her elemanı toplama ekle
        }
        return sum;
    }
}
