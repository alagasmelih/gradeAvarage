import java.util.Scanner;

public class gradeAvarage {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, toplam = 0;
        double avarage ;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniiz: ");
        mat = input.nextDouble();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();

        if ((mat >= 0) && (mat <= 100)) {
            toplam = toplam + mat;

        }
        if ((fizik >= 0) && (mat <= 100)) {
            toplam = toplam + fizik;

        }
        if ((turkce >= 0) && (turkce <= 100)) {
            toplam = toplam + turkce;

        }
        if ((kimya >= 0) && (kimya <= 100)) {
            toplam = toplam + kimya;
        }
        if ((muzik >= 0) && (muzik <= 100)) {
            toplam = toplam + muzik;


        }
        avarage = (toplam / 5);
        if (avarage <= 55) {

            System.out.println("Tebrikler sınıfta kaldınız :) Ortalamanız: " + avarage);
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz. Ortalamanız: " + avarage);

        }


    }
}
