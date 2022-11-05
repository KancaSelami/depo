/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package büyüksayi;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Büyüksayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int birinci, ikinci ;
        Scanner klavye = new Scanner(System.in) ;
        System.out.println("birinci sayiyi giriniz");
        birinci = klavye.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        ikinci=klavye.nextInt();
        System.out.println(birinci);
        System.out.println(ikinci);
        if (birinci>ikinci) {
            System.out.println("büyük olan sayi= " + birinci);
        }else if (birinci==ikinci){
            System.out.println("sayilar birbirine esittir");}
        else
            System.out.println( "büyük olan sayi = " + ikinci);
            
        
                
        // TODO code application logic here
    }
    
}
