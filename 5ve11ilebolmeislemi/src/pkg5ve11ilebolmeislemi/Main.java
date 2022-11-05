/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5ve11ilebolmeislemi;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner klavye=new Scanner(System.in);
        int sayi ;
        System.out.println("lutfen 5 ve 11 ile bolunebilirligini kontrol edilmesini istediginiz sayiyi giriniz");
        sayi=klavye.nextInt();
        if(sayi%5==0){
            System.out.println(sayi+"tam sayisi 5 e tam bolunebilmektedir.");
            
            }
        else 
            System.out.println(sayi+" 5 e tam bolunmuyor");
        if(sayi%11==0){
            System.out.println(sayi+" 11 e tam bolunebilmektedir.") ;
        }
        else 
            System.out.println(sayi+" 11 e tam bolunememektedir. ");
    }
        }
   
  
