public class Task18 {

    /*
    18) Bir dizinin belirli bir elemanını bulup güncelleyen bir metod yazın.
    (ipucu: method ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün)
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] array = {3, 5, 7, 2, 8};

        // Belirli bir elemanı bulup güncelleyen metodu çağırın
        int target = 7;
        int newValue = 10;
        boolean isUpdated = updateArrayElement(array, target, newValue);

        // Güncelleme başarılıysa yeni diziyi ekrana yazdırın, değilse hata mesajı yazdırın
        if (isUpdated) {
            System.out.println("Dizi güncellendi: " + java.util.Arrays.toString(array));
        } else {
            System.out.println("Belirtilen eleman dizide bulunamadı.");
        }
    }

    // Bir dizinin belirli bir elemanını bulup güncelleyen ve güncelleme gerçekleşirse true, yoksa false döndüren metod
    public static boolean updateArrayElement(int[] array, int target, int newValue) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                array[i] = newValue; // Eleman bulunduğunda güncelle ve true döndür
                return true;
            }
        }
        return false; // Eleman bulunamadığında false döndür
    }
}
