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
public class sitaticliic {
    
    void islem(){
    Icsinif icsinif=new Icsinif();
    Icsinif.carpma();
    
    }
    static class Icsinif{
    
   static void carpma(){
     int a,b,carpma;
        Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen carpmak istediginiz 2 tam sayiyi  giriniz");
        a=klavye.nextInt();
        b=klavye.nextInt();
        carpma=a* b;
        System.out.println(a+" ve "+b+" sayilarinin carpimi = "+carpma);
    
    }
    }
}
