package lesson08;

public class page08 {
    public static void main(String[] args) {
        String[] harfler = new String[] {"a","i","e","o","u"};  // 1. array
        String[] sayılar = new String[5];    // 2. array
        sayılar = harfler.clone();   // klonlama işlemi
        for (int i = 0; i < sayılar.length; i++) {    // kimi kime kopyalamak istiyoruz biz harfler arrayını
                                        // sayılar arrayına kopyalamak isstiyoru z o halde for loop ta sayılar olmalı
            System.out.println((i+1) +  ". inci dizinin elemanı = "   + sayılar[i]);
        }
            // arrayların aynı olup olamdılaını bakalım boolean olarak
        boolean arraylar_esitmi = harfler.equals((sayılar));
        System.out.println("arraylar aynı mı acaba: " + arraylar_esitmi);
    }
}
