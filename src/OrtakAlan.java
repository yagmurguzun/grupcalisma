import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrtakAlan {
    public static void main(String[] args) {
        System.out.println("ortak calisma alani");

        System.out.println("Hi! Elif is here ");

        System.out.println("conflict is begining ");

        System.out.println("Mehmet'in alani");


        /*

        (Elif) Arkadaslar branch mainde degişiklik yapmayin lutfen !
        (Elif) Tum degisiklikleri kendi branchinizde yaptiktan sonra "push" yapmadan once kontrol edin !!

         */




        //Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle ve bir harf giriniz");
        String girilencumle0=scanner.nextLine();
        char girilenharf=scanner.next().charAt(0);

        int sayac=0;
        String[] cumlearr=girilencumle0.split("");
        for (String each:cumlearr
             ) {
            if(each.equals(girilenharf)){
                sayac++;
                System.out.println("cumlede harf "+sayac+"kadar kullanilmistir");
        }else{
                System.out.println("harf cumlede kullanilmamistir");
            }
        }





    }
}
