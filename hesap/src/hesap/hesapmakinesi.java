/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hesap;

/**
 *
 * @author selami
 */
public class hesapmakinesi {
    public static double topla(int a,int b){
    double sonuc=a+b;  
    return sonuc;
    }
    public static double cikarma(int a, int b){
    double cikarma=a-b;
    return cikarma;
    }
    public static double carpma(int a, int b){
    double carpma=a*b;
    return carpma;
    }
    public static double bolme(int a, int b){
        if (b!=0){
            double bolme=a/b;
    return bolme;
        }else {
        System.out.println("lutfen b sayisini 0 dan farkli bir tam sayi giriniz");
        return -1;
     }
    }
     public static double ustu(int a, int b){
 
    return Math.pow(a, b);
    }
     public static double kok(int a){
     return Math.sqrt(a);
     
     }
}
