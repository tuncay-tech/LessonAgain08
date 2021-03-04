package lesson08;

import java.util.Arrays;

public class page15 {
    public static void main(String[] args) {
        // sort kullanımı
        int[] birinci_array = {1, 2, 3, 67, 77, 8, 7, 45, 7, 8};
        // sort tan önce
        for (int i = 0; i < birinci_array.length; i++) {
            System.out.print(birinci_array[i] + " >> ");
        }
        System.out.println();
        Arrays.sort(birinci_array);
        // sort tan sonra
        for (int i = 0; i < birinci_array.length; i++) {
            System.out.print(birinci_array[i] + " >> ");

        }





    }
}
