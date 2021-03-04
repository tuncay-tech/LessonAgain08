package lesson08;

import java.util.Arrays;

public class page16 {
    public static void main(String[] args) {
        // sort kullanımı  string yapalım
        String[] birinci_array = {"b", "k", "c", "a", "e", "k", "o", "j", "l", "c"};
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
