/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizilerdesiralama;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Dizilerdesiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lineer sayilarda arama capma elemanin bulma .
        int[] liste={1,2,3,4,5,6,7,8,9};
        System.out.println(liste.length+" boyutlu eleman var.");
        System.out.println(liste[3]);
        int aranilansayi;
        Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen hangi elemanin liste sirasini ogrenmek istiyorsunuz: ");
        aranilansayi=klavye.nextInt();
        
        for (int i = 0; i < liste.length; i++) {
           if (aranilansayi==liste[i]){
               System.out.println("aramis oldugunuz eleman "+ i+". satırda bulunmaktadir.");
           }else 
                System.out.println("aradıgınıy sayi dizide bulunmamaktadir");
            
        }
    }
    
}
