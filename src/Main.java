import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] sayilar = new int[]{0,1,2,3};
//        System.out.println(sayilar.length);
//        System.out.println(sayilar[0]);
//        System.out.println(sayilar[1]);
//        System.out.println(sayilar[2]);
//        System.out.println(sayilar[3]);
//        // System.out.println(sayilar[4]); Burada hata alırız çünkü dizimiz 4 elemanlı ve index 0 dan başlar.
//        sayilar = new int[4];
//        System.out.println(sayilar.length);
//        System.out.println(sayilar[0]);
//        System.out.println(sayilar[1]);
//        System.out.println(sayilar[2]);
//        // new ile diziyi yeniden oluşturduktan sonra değerlerini bilmiyoruz o yüzden 0 değeri dönüyor.
          // Burada dizinin mantığını anladık şimdi arraylist nedir ona bakalım.
        ArrayList sayilar = new ArrayList();
        // Arraylist i böyle tanımlarsak içine her türlü değeri alır.
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(2);
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(1));
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));
        // Get istediğimiz değeri önümüze getirir.
        // Set değerini değiştirmek istediğimiz index'in değerini değiştirir.
        sayilar.set(0,100);
        System.out.println(sayilar.get(0));
        // Listeden eleman silmek için remove kullanıyoruz.
        sayilar.remove(0);
        // 0. index i siliyorum ve dizim 3 elemandan 2 elemana düşüyor.
        System.out.println(sayilar.size());
        for (Object say : sayilar){
            System.out.println(say);
        }
        // System.out.println(sayilar.get(2)); yani bu kod hata alacaktır.
        // Tamamen diziyi silmek istiyorsak clear kullanıyoruz.
        sayilar.clear();
        System.out.println(sayilar.size());
        // boyut sıfırr.
        // System.out.println(sayilar.get(0));
        // yukarıdaki kodda hata alıyoruz

    }
}