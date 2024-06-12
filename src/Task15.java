public class Task15 {

    /*
    15) Bir dizideki elemanları birbirine toplayan ve sonucu döndüren bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] array = {3, 5, 7, 2, 8};

        // Dizideki elemanları toplayan metodu çağırın
        int sum = sumArray(array);

        // Sonucu ekrana yazdırın
        System.out.println("Dizinin elemanlarının toplamı: " + sum);
    }

    // Bir dizideki elemanları toplayan ve sonucu döndüren metod
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
