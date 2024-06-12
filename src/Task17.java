public class Task17 {

    /*
    17) Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metod yazın.
    (ipucu method true veya false olarak değer dönmeli)
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] array = {3, 5, 7, 2, 8};

        // Belirli bir elemanın dizide olup olmadığını kontrol eden metodu çağırın
        int target = 7;
        boolean isFound = searchArray(array, target);

        // Sonucu ekrana yazdırın
        System.out.println("Dizide " + target + " var mı? " + isFound);
    }

    // Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden metod
    public static boolean searchArray(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        for (int number : array) {
            if (number == target) {
                return true; // Eleman bulunduğunda true döndür
            }
        }
        return false; // Eleman bulunamadığında false döndür
    }
}
