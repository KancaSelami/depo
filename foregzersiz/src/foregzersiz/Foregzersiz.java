/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foregzersiz;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Foregzersiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       
       int k ;
       Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen hangi sayiya kadar olan sayilarin toplamini istiyorsunuz ? ");
       
       k=klavye.nextInt();
        int i,toplam = 0;
       for (i=0;i<=k;i++){
       toplam = toplam + i;
       
       }
        System.out.println("girdiginiz   " +k+ " sayisina kadar olan sayilarin toplami =   "+toplam);
       
       
    }
    
}
