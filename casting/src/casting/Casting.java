/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting;

/**
 *
 * @author selami
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // asagidaki tanimda benimstringim objesinde degisim yapamiyorum .
        Object benimstringim="selami kanca";
        System.out.println(benimstringim);
        
        benimstringim.hashCode();
          //asagida benim stringim olemanini casting yani miras verdigimden ab elemanina artik degisiklik yapabiliyorum.
        String ab=(String)benimstringim;
       
        System.out.println(ab.toUpperCase());
        //asagida kucuk olan bir veri tipini daha buyuk bir veri tipine donusturduk .kucukten buyuge donusum.
        int a=100;
        long b=a;
        float c=a;
        //buyukten kucuge donusum yaparken neye donusturmek istedigimizi asagida belirtildigi gibi belirememiz gerekli.
        double d=100.23;
        int i=(int) d;
        System.out.println(i);
        
    }
    
}
