/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalitim;

/**
 *
 * @author selami
 */
public class Kalitim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        aslan aslan1= new aslan();
        aslan1.yas=6;
        aslan1.agirlik=32;
        aslan1.renk="siyah";
        aslan1.beslendimi=true;
        aslan1.isim="aslan";
        aslan1.beslendimi();
        aslan1.kosu();
        aslan1.kukredimi();
        guvercin guvercin1=new guvercin();
        guvercin1.kosu();
        
    }
    
}
