package lesson08;

public class page13 {
        public static void main(String[] args) {
            // page 12 şöylede olablir
            int[] birinci_array = {1, 2, 3, 67, 77, 8, 3, 45, 7, 8};
            int[] ikinci_array = {2, 3, 56, 77, 89, 0, 65, 12, 1, 2, 3, 4};
            int source_position = 2;
            int destination_position = 5;
            int length = 4;
            System.arraycopy(birinci_array, source_position, ikinci_array, destination_position, length);
            for (int i = 0; i < ikinci_array.length; i++) {
                System.out.print(ikinci_array[i] + ">>");
            }

        }
    }
