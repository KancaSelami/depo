/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tahminetme;

/**
 *
 * @author selami
 */
public class Tahminetme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Oyuncu selami=new Oyuncu(10, 3, "selami");
       Kontrolcu oyun=new Kontrolcu(selami);
       oyun.basla();
    }
    
}
