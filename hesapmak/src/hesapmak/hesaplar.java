/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hesapmak;

/**
 *
 * @author selami
 */
public class hesaplar {
    public static double toplama(int a, int b){
        double toplam =a+b;
        return toplam;
    
    }
    public static double cikarma(int a, int b){
        double cikarma =a-b;
        return cikarma;
    }
    public static double carpma(int a, int b){
        double carpma =a*b;
        return carpma;
    }
    public static double bolme(int a, int b){
        double bolme =a/b;
        return bolme;
    }
    public static double ussu(int a, int b){
        
        return Math.pow(a, b);
    }
    public static double kok(int a){
       
        return Math.sqrt(a);
    }
    
    
    
    
}
