package lesson08;

public class page09 {
    public static void main(String[] args) {
        // array1 elemalarını array2 copy yapacaz ve array2 ye yeni bir eleman atayacağız
        // 4 elemanlı bir array oluşturduk
        int[] array1 = {1,3,5,7};
        // 1 elelma daha eklemek istiyoruz
        // yeni arayı tanımlayalım 5 elemalı olsun.
        int[] array2 = new int[5];

        // array2 nın ilk 4 elemanını array1 den alalım for loop la alacağız
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        // 5. elemanı ekleyelim
        array2[4] = 23;
        for (int i = 0; i < array2.length; i++) {
            System.out.println((i+1) + ". nci eleman: " + array2[i]);

        }

    }
}
