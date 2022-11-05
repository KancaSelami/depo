/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arama;

/**
 *
 * @author selami
 */
public class Arama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kedi kedi1=new kedi();
        kedi1.isim="van kedisi";
        System.out.println(kedi1.getIsim());
        kaplan kaplan1 =new kaplan ();
        kaplan1.setKilo(25);
        kaplan1.isim="kaplan1";
        kaplan1.setYas(10);
        System.out.println(kaplan1.getAgirlik());
        kaplan1.getAgirlik();
        
    }
    
}
