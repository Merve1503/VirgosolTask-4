public class Task1 {

    /*
    1) Bir dizi oluşturun ve bu dizinin elemanlarını foreach döngüsü kullanarak ekrana yazdırın.
    */

    /*
    foreach döngüsü;
    for (ElementType element : collection) {
    }
    // element üzerinde işlemler
    */

    public static void main(String[] args) {
        // Bir dizi oluşturun
        int[] numbers = {1, 2, 3, 4, 5};

        // foreach döngüsü kullanarak dizinin elemanlarını ekrana yazdırın
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
