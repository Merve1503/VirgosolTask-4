public class Task9 {

    /*
    9) Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, 7, 4, 10, 7, 12};

        // Belirli bir değere sahip elemanların sayısını bulan metodu çağırın
        int value = 7;
        int count = countOccurrences(numbers, value);

        // Sonucu ekrana yazdırın
        System.out.println("Dizide " + value + " değerine sahip eleman sayısı: " + count);
    }

    // Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan metod
    public static int countOccurrences(int[] array, int value) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int count = 0; // Eleman sayısını tutacak değişken
        for (int number : array) {
            if (number == value) {
                count++; // Değer ile eşleşen eleman bulunursa sayacı artır
            }
        }
        return count;
    }
}
