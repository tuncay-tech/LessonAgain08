package lesson08;

public class page05 {
    public static void main(String[] args) {
        // arrayın tüm elemalarına ulaşmada forloop kullanma
        int[] int_arrays = {2, 3, 5, 8, 9};
        for (int i = 0; i < int_arrays.length; i++) {
            System.out.println((i + 1) + " . nci elemanı: " + int_arrays[i]);

        }
    }
}
