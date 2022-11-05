/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fibonacci,adet,sayi1=0,sayi2=1;
        System.out.println("lutfen kac adet fibonacci sayisi gormek istiyorsunuz onu giriniz");
       Scanner klavye=new Scanner(System.in);
       adet=klavye.nextInt();
        for (int i = 2; i < adet+2; i++) {
           fibonacci=sayi1+sayi2;
            System.out.println(fibonacci);
            sayi1=sayi2;
            sayi2=fibonacci;
            
            
        }
       
    }
     
    }
    

