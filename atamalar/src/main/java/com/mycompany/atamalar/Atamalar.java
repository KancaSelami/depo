/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atamalar;

/**
 *
 * @author selami
 */
public class Atamalar {

    public static void main(String[] args) {
        //byte 127 ile -127 arasinda degerler atanir 
        //short daha buyuk byte tiplerinde atanir  5 basamakli
        //int tamsayilar 9 basamakli
        // long daha buyuk tam sayilar yazilan sayinin sonuna l harfi eklenirse 19 basamakli giris yapilir 
        //float kesirli sayilar 40 basamak tam sayi  ondalikli kismi 3 basamak
        //double daha buyuk kesirli sayilar
        
        
        byte bytem = 127 ;
        System.out.println(bytem);
        
        short sortem = 12222 ;
        System.out.println(sortem);
        
        int intem = 922222222 ;
        System.out.println(intem);
        
        long longem = 4244444353453454655l ;
        System.out.println(longem);
        
        float floatim = 12534.23566f  ;
        System.out.println(floatim);
        
        double doublem =1231231.412444766666578585858759 ;
        System.out.println(doublem);
         
      char benimchar = 'f';
        System.out.println(benimchar);
        boolean benimbolum = false ;
        System.out.println(benimbolum);
        
        intem = (int) longem ;
        //burada buyukdegeri kucuk degere donusturme yaptik.
        doublem = floatim ;
        System.out.println(intem);
        System.out.println(doublem);
        String benimstring = "sabir";
        System.out.println(benimstring);
        // burada donusum bir degeri baska bir degere donusturme yaptik.
        
        
        benimstring = String.valueOf(doublem);
        System.out.println(benimstring);
        // nurada yazilmis olan karakteri ne yazilmissa onu almiyor double 
        //karakteri ne ise omnu aliyor.
        String kral = new String("selami") ;
        System.out.println(kral);
        //burada yeni bir tanimlama yaptik.
        
        benimstring = String.valueOf(benimbolum);
        System.out.println(benimbolum);

        
    }
}
