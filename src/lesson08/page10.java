package lesson08;

public class page10 {
    public static void main(String[] args) {
        int[] array = {2,4,5,8,9};
        int[] array_yeni = new int[7];

        for (int i = 0; i < array.length; i++) {
            array_yeni[i] = array[i];
        }
        array_yeni[5] = 1453;
        array_yeni[6] = 1071;

        for (int i = 0; i < array_yeni.length; i++) {
            System.out.println((i+1) + ". nci eleman: " + array_yeni[i]);
            
        }
    }
}
