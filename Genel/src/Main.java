public class Main {
    public static void main(String[] args) {
        //intellisense
        System.out.println("Merhaba Java!");


    //Variables (Değişkenler)

    int sayi = 12;
    String mesaj = "Öğrenci Sayısı :" ;
    System.out.println(mesaj +sayi);
    System.out.println(mesaj+sayi);
    System.out.println("Öğrenci sayım: "+sayi);
    System.out.println("Öğrenci sayım: "+sayi);

    // dataTypes ?sayi2 neden -129 çıkıyor yazdırılınca 12.5 değil de??
        double sayi2= 12.5;
        sayi2 = -129;
        char karakter='A';
        boolean dogruMu=false;
        System.out.println(sayi2);

        //Conditionals
        int sayi3 =20;
        if(sayi3<20) {
            System.out.println("Sayı 20'den küçüktür");
        }else if (sayi3==20){
            System.out.println("Sayı 20'ye eşittir");
        }else{System.out.println("Sayı 20'den büyüktür");}


            char harf = 'A';

            switch (harf) {
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın sesli harf");
                    break;
                default:
                    System.out.println("İnce Sesli Harf");
            }
        int number =5;
        int total =0;
        for (int i=0;i<number;i++) {
            if(number %i==0) {
                total=total+i;
            }
        }
        if(total==number) {
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
        }
    }



