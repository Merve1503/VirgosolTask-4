public class Task10 {

    /*
    10) Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, 7, 4, 10, 7, 12};

        // Belirli bir değeri arayan ve indeksi döndüren metodu çağırın
        int value = 7;
        int index = findIndex(numbers, value);

        // Sonucu ekrana yazdırın
        if (index != -1) {
            System.out.println("Dizi içinde " + value + " değeri bulundu. İndeks: " + index);
        } else {
            System.out.println("Dizi içinde " + value + " değeri bulunamadı.");
        }
    }

    // Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren metod
    public static int findIndex(int[] array, int value) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Değer bulunduğunda indeksi döndür
            }
        }
        return -1; // Değer bulunamazsa -1 döndür

    }
}
