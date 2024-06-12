public class Task14 {

    /*
    14) Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.
    */

    public static void main(String[] args) {

        // Test için bir dizi oluşturun
        int[] originalArray = {3, 5, 7, 2, 8, 4, 10, 12};

        // Tek sayıları bulan ve yeni diziye ekleyen metodu çağırın
        int[] oddNumbersArray = findOddNumbers(originalArray);

        // Yeni diziyi ekrana yazdırın
        System.out.println("Tek sayılar: " + java.util.Arrays.toString(oddNumbersArray));
    }

    // Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen metod
    public static int[] findOddNumbers(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Dizi null olamaz");
        }

        int count = 0;
        // Öncelikle kaç tane tek sayı olduğunu bulalım
        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }

        // Tek sayıları tutacak yeni bir dizi oluşturalım
        int[] oddNumbersArray = new int[count];
        int index = 0;

        // Tek sayıları yeni diziye ekleyelim
        for (int number : array) {
            if (number % 2 != 0) {
                oddNumbersArray[index] = number;
                index++;
            }
        }

        return oddNumbersArray;
    }
}
