/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesap;

/**
 *
 * @author selami
 */
public class Hesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  hesap= hesapmakinesi.carpma(5, 1);
        System.out.println(hesap);
        System.out.println(hesapmakinesi.ustu(5, 8));
        System.out.println(hesapmakinesi.kok((int) (54+(hesapmakinesi.kok(100)))));
    }
    
}
