/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swıchcaseders1;

/**
 *
 * @author selami
 */
public class Swıchcaseders1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String haftaningunleri= "cuma" ;
        switch (haftaningunleri) {
            case "pazartesi" -> System.out.println("bugun dersin sabah 8;00 de ");
            case "sali" -> System.out.println("bugun ders ogleden sonra 13:30 da basliyor");
            case "carsamba" -> System.out.println("bugun dersin 15:00 de");
            case "persembe" -> System.out.println("bugun dersin yok ,toplanti var");
            case "cuma" -> System.out.println("bugun tam gun ders var");
            case "cumartesi" -> System.out.println("spor zamani");
            case "pazar" -> System.out.println("piknik zamani ama aksam derse hazirligini unutma");
                
            default -> throw new AssertionError();
        }
        
        
    }
    
}
        