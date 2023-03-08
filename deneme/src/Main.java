import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int a=12;
        System.out.println(a);

        String isim="serdar";

        System.out.println(isim);

        double dolarKuruDun=18.24;
        double dolarKuruBugun=18.34;

        String resim;

        if(dolarKuruBugun>dolarKuruDun)
        {
            resim="Up.swg";
            System.out.println(resim);

        }


        else {
            resim="Down.swg";
            System.out.println(resim);
        }
        //diziler

        String[] array={"Hizli kredi","İhtiyac kredisi","İs kredisi"};

        for(int i=0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}