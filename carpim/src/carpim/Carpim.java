/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carpim;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Carpim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k ,carpim=1;
        Scanner klavye =new Scanner(System.in);
        System.out.println("lutfen 1 den kaca kadar olan tam sayilarin carpimini istiyorsunuz k = ");
        k=klavye.nextInt();
        while(k>0){
        carpim*=k;
        k--;
        }
        System.out.println("1 den  "+ k + "ya kadar olan sayilarin carpimi = "+ carpim);
    }
    
}
