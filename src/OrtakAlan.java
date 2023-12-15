import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrtakAlan {
    public static void main(String[] args) {
        System.out.println("ortak calisma alani");

        System.out.println("Hi! Elif is here ");

        System.out.println("conflict is begining ");

        System.out.println("Mehmet'in alani");

        System.out.println("Enes burada");


        //Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle ve bir harf giriniz");
        String girilencumle0 = scanner.nextLine();
        String girilenharf = scanner.next();

        int sayac = 0;
        String[] cumlearr = girilencumle0.split("");
        System.out.println(Arrays.toString(cumlearr));
        for (int i = 0; i < cumlearr.length; i++) {
            if (cumlearr[i].equalsIgnoreCase(girilenharf)) {
                sayac++;
            }
        }
        if (sayac > 0) {
            System.out.println("cumlede harf " + sayac + "kadar kullanilmistir");
        } else {
            System.out.println("harf cumlede kullanilmamistir");
        }

    }

         */


         /*
        Verilen String bir array’deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.

        String [] isimler={"metin","elif","enes","yagmur","ozan","ali","ismail"};
         */
        String [] isimler={"metin","elif","enes","yagmur","ozan","ali","ismail"};

        List<String> isimlerList=new ArrayList<>();

        for (String each:isimler) {
            if (each.length()%2==0){
                isimlerList.add(each.substring(0,each.length()/2));
        }else {
                isimlerList.add(each.substring(each.length()/2));
            }

        }
        System.out.println(isimlerList);

    }
}
