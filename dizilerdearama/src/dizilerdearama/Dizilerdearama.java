/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizilerdearama;
import java.util.Arrays;
/**
 *
 * @author selami
 */
public class Dizilerdearama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] listem={1,2,8,4,9,6,7};
        // asagida int tipinde diziyi String tipinde diziye cevirdik.
        System.out.println(Arrays.toString(listem));
       /* asagida 1. ve 5. elemanlara kadar 4 u atadik.
        Arrays.fill(listem, 0, 5, 4);
        System.out.println(Arrays.toString(listem));*/
       // asagida listenin elemanlarini kucukten buyuge dogru siralayacagiz.
     /* Arrays.sort(listem);
        System.out.println(Arrays.toString(listem));
     //asagida listede 9 elemanin satirini ariyoruz liste kucukten buyuge dogru siralanmak zorunda.
        int index=Arrays.binarySearch(listem,9);
        System.out.println(index);*/
     //simdik bir diziden ilk 3  elemani alarak yeni bir dizi olusturalim
     /* eger biz listem dizisini siralamasini yaptiktan sonra yeni bir dizi olusturur isek 
    bizim olusan dizimiz kuckten buyuge dogru ilk 3 elemani alir
     int[] listem2=Arrays.copyOf(listem,3);
        System.out.println(Arrays.toString(listem2));
        //(listem,2,5) demek listem dizisinin 2.3.4. elemanlarini alarak bir dizi olustur demek 5.elemani almaz bas dahil son dahil degil
        int[] listem3=Arrays.copyOfRange(listem, 2, 5);
        System.out.println(Arrays.toString(listem3));*/
        int[] listem4 ={1,2,8,4,9,6,7};
        // asagida 2 dizinin esit olup olmadigini gorduk.
        System.out.println(Arrays.equals(listem, listem4));   
        
    }
    
}
