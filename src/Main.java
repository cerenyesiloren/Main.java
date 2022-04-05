import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik , kimya, turkce, tarih, muzik;

        Scanner read = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = read.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = read.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = read.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = read.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = read.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = read.nextInt();

        int toplam = (mat+fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6;
        System.out.println("ortalamanız : " + sonuc) ;

        String durum ;
        durum = (sonuc > 60 ) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(durum);
    }
}
