package aracSigortaApp;

import java.util.Scanner;

public class Arac {


    public String type;//otomobil
    public int prim ;//tarife donemi , tipine hesapla

    //5.prim hesaplama

    public void countPrim(int term ){
        //tipe gore hesaplama neden if degil switch case 3 ten fazla deger oldugu icin
        switch (this.type){//otomobil bu classin objesinin  tipi

            case "otomobil":
                this.prim=term==1  ?2000 : 2500;//prim bu claassin objesinin ozelligi bu pbjenin pirimi
                break;
            case "kamyon":
            this.prim=term==1  ?3000 : 3500;
            break;
            case"otobus":
             countBusPrim(term);

                break;
            case "motosiklet":
                this.prim=term==1 ? 1500 : 1750 ;
                break;
            default:
                System.out.println("Hatali giris !");
                this.prim =0;
                break;


        }



        }

        //6.
        public void countBusPrim(int term){
            Scanner inp = new Scanner(System.in);
            System.out.println("1. 18-30 Koltuk arası ");
            System.out.println("2. 31 Koltuk ve üzeri ");
            int busType = inp.nextInt();
            switch (busType){

                case 1:
                    this.prim =term==1 ? 4000 : 4500;
                    break;
                case 2 :
                    this.prim=term==1 ? 5000:5500;
                    break;
                default:
                    System.out.println("Hatali giris !");
                this.prim=0;
                    break;


            }



    }




}
