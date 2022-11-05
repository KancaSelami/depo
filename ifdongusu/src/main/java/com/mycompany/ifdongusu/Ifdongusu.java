/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ifdongusu;

/**
 *
 * @author selami
 */
public class Ifdongusu {

    public static void main(String[] args) {
        int yas=15  ;
      
        if ( yas>18 ){
            System.out.println("oy kullanabilirsiniz");
        }
        else {
            System.out.println("oy kullanamazsiniz");
        }
       /// 3 lu dongu string ile asagidaki gibi olkuyor tek satira dusuruyor if dongusunu.      
       String  sonuclar = yas <= 18 ? "oykullanamazsin1" : "oy kullanabilirsiniz" ; 
        System.out.println(sonuclar);
    }
   
}
