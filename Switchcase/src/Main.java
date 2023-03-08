import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // switch case yapısı kullanımı kullanıcıdan int değer alarak

        Scanner degerAlma= new Scanner(System.in);
        System.out.println("1- Sistemde kayit varsa girer  " +
                "2- Sisteme kayit yapar  "+"3- Sistemden cikar");

        System.out.print("Degeri giriniz ;");
        int deger = degerAlma.nextInt();

        switch (deger)
        {
            case 1:
                System.out.println("selam sisteme girdiniz");
                break;
            case 2:
                System.out.println("Kayidiniz olusturuldu");
                break;
            case 3:
                System.out.println("Cikis yapildi.");
                break;
            default:
                System.out.println("Gecersiz islem");
        }
    }
}