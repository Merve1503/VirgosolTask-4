public class Task4 {

    /*
    4) Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // En küçük elemanı bulan metodu çağırın ve sonucu ekrana yazdırın
        int min = findMin(numbers);
        System.out.println("Dizideki en küçük eleman: " + min);
    }

    // Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan metod
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Dizi boş veya null olamaz");
        }

        int min = array[0]; // İlk elemanı başlangıçta en küçük olarak kabul et
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Daha küçük bir eleman bulunursa min'i güncelle
            }
        }
        return min;
    }
}
