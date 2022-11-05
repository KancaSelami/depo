/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author selami
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // interface abstract ile benzer soyut ama icinde sadece static degerler atanabilir
        sekil ucgen=new ucgen();
       ucgen.ciz();
       ucgen.alan();
       surucu selami=new surucu(new bmw());
       surucu esma =new surucu(new mercedes());
       selami.sur();
       esma.sur();
    }
    
}
