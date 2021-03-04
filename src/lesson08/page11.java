package lesson08;

public class page11 {
    public static void main(String[] args) {
        //  elemalı bir array oluşturun ve son elemanını siliiz
        int[] birinci_array = {2, 3, 4, 5, 6};
        int[] ikinci_array = new int[birinci_array.length - 1];  //2,3,4,5  olcak

        for (int i = 0; i < ikinci_array.length; i++) {
            ikinci_array[i] = birinci_array[i];  // birinci array elemanlarını array 2 ataıyoruz burda

        }
            // ikinci arrayın elemnlarını yazdıralım
        for (int i = 0; i < ikinci_array.length; i++) {
            System.out.println((i+1) + ". inci eleman: " + ikinci_array[i]);

        }
    }
}
