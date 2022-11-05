/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swichegzersiz;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Swichegzersiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int kacincigun ;
        Scanner klavye = new Scanner (System.in);
        System.out.println("lutfen bulungunuz tarini 1-8 araliginda  belirtiniz");
        kacincigun =klavye.nextInt();
        switch(kacincigun){
            case 1 -> System.out.println("bugun pazartesi");
            case 2 -> System.out.println("bugun sali");
            case 3 -> System.out.println("bugun carsamba");    
            case 4 -> System.out.println("bugun persembe");
            case 5 -> System.out.println("bugun cuma");
            case 6 -> System.out.println("bugun cumartesi");
            case 7 -> System.out.println("bugun pazar");
            case 8 -> System.out.println("basa donduk ve yine pazartesi");
           default -> System.out.println("lutfen belirtilen aralikta sayi giriniz") ;
                                
            }
           
        }
            }

        
    
    

            
        
    
   
        
   
    

   
        
   