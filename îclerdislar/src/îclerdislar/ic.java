/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package îclerdislar;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class ic {
void Islem () {
     Icsinif icsinif=new Icsinif();
     icsinif.Toplama();
     
  
}
          
    class Icsinif{      
    void Toplama (){
        int a,b,toplam;
        Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen toplamk istediginiz 2 tam sayiyi  giriniz");
        a=klavye.nextInt();
        b=klavye.nextInt();
        toplam=a+b;
        System.out.println(a+" ve "+b+" sayilarinin toplami = "+toplam);
        
    }}

    
        void cikarma(){
 int a,b,cikarma;
        Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen cikarmak istediginiz 2 tam sayiyi  giriniz");
        a=klavye.nextInt();
        b=klavye.nextInt();
        cikarma=a-b;
        System.out.println(a+" ve "+b+" sayilarinin farki = "+cikarma);

}
    
}
