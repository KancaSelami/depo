/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahminetme;

import java.util.Random;

/**
 *
 * @author selami
 */
public class Kontrolcu {
    Random random=new Random();
    int bulunacaksayi=random.nextInt(11);
    Oyuncu oyuncu;
    
  

    public Kontrolcu(Oyuncu oyuncu) {
        this.oyuncu = oyuncu;
    }
    public void basla(){
       
    while (oyuncu.hak>0){
    int tahminedilensayi=oyuncu.tahmin();
    if(tahminedilensayi==bulunacaksayi){
    oyuncu.puan+=10;
        System.out.println("tebrikler sayiyi buldunuz.");
    
    }else if (tahminedilensayi>bulunacaksayi){
        oyuncu.puan-=2;
       
       
        System.out.println("lutfen daha kucuk bir sayi giriniz.");
       
        
    }else 
    {   
        oyuncu.puan-=2;
        System.out.println("lutfen daha buyuk bir sayi giriniz.");}
    }
    
    }
   
    }
}