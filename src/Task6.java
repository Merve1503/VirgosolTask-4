public class Task6 {

    /*
    6) Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.
    */

    public static void main(String[] args) {
        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Dizideki elemanların ortalamasını bulan metodu çağırın ve sonucu ekrana yazdırın
        double average = calculateAverage(numbers);
        System.out.println("Dizideki elemanların ortalaması: " + average);
    }

    // Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan metod
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Dizi boş veya null olamaz");
        }

        int sum = 0; // Toplamı tutacak değişken
        for (int number : array) {
            sum += number; // Her elemanı toplama ekle
        }

        return (double) sum / array.length; // Toplamı eleman sayısına bölerek ortalamayı
    }
}
