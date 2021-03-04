package lesson08;

public class page06 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "mehmet";
        names[1] = "ali";
        names[2] = "kazım";
        names[3] = "altan";
        for (int i = 0; i < names.length; i++) {
            System.out.println((i+ 1) + ".nci öğrenci: " + names[i]);
        }
    }
}
