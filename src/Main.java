import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner sınıfını oluştur
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan değerleri al

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();


        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + muzik + turkce + tarih + kimya;
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamanız : " + sonuc);

        int gecer = 60;
        boolean kosul1 = sonuc >= gecer;

        String str = (kosul1) ? "Geçti" : "Kaldı";
        System.out.println(str);

    }
}