
package deneme;
import java.util.Scanner;
public class ders_ortalamasi_programi {

    public static void main(String[] args) {
        //burda degiskenleri tanimliyoruz
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sinifimizi tanimliyouz
        Scanner inp = new Scanner(System.in);

        //kullanicidan degerleri istiyoruz
        System.out.print("Matematik notunu giriniz..:");
        matematik = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz..:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz..:");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuzu giriniz..:");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz..:");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuzu giriniz..:");
        muzik = inp.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6.0;
        System.out.println("Not ortalamaniz..:" + ort);
        boolean sonuc = ort >= 50.0;
        String str = (sonuc) ? "Gecti" : "Kaldi";
        System.out.print(str);

    }
}
