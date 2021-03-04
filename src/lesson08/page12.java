package lesson08;

public class page12 {
    public static void main(String[] args) {

        // arraycopy metıdu uyguloyoruz
        int[] birinci_array = {1, 2, 3, 67, 77, 8, 3, 45, 7, 8};
        int[] ikinci_array = {2, 3, 56, 77, 89, 0, 65, 12, 1, 2, 3, 4};

        int[] source_array1 = birinci_array;
        int source_position = 2;  // array 1 elemanı 3 den başlayarak 4 uzunlukta
        int[] destination_array2 = ikinci_array; // array 2 elemanı 0 dan başlayıp 4 elamanı ilk araya dan
        int destination_position = 5;             // 2. arraya kopyaladık
        int length = 4;
        System.arraycopy(source_array1,source_position,destination_array2,destination_position,length);
        for (int i = 0; i < destination_array2.length; i++) {
            System.out.print(ikinci_array[i] + ">>");
        }

    }
}
