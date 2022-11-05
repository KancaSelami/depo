/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coptoplayici;



/**
 *
 * @author selami
 */
public class Coptoplayici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ogrenci ogrenci1=new ogrenci("selami");
        ogrenci ogrenci2=new ogrenci("esma");
        ogrenci ogrenci3=ogrenci1;
        
        System.out.println(ogrenci1.adsoyad);
        System.out.println(ogrenci2.adsoyad);
        System.out.println(ogrenci3.adsoyad);
        ogrenci1=null;
        System.out.println(ogrenci2.adsoyad);
        System.out.println(ogrenci3.adsoyad);
        
        
    }
    
}
