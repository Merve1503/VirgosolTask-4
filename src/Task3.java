public class Task3 {

    /*
    3) Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.
     */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // En büyük elemanı bulan metodu çağırın ve sonucu ekrana yazdırın
        int max = findMax(numbers);
        System.out.println("Dizideki en büyük eleman: " + max);
    }

    // Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan metod
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Dizi boş veya null olamaz");
        }

        int max = array[0]; // İlk elemanı başlangıçta en büyük olarak kabul et
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Daha büyük bir eleman bulunursa max'i güncelle
            }
        }
        return max;
    }
}
