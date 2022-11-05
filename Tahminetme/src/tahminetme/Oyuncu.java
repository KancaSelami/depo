/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahminetme;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Oyuncu {
    int puan;
    int hak;
    String isim;

    public Oyuncu(int puan, int hak, String isim) {
        this.puan = puan;
        this.hak = hak;
        this.isim = isim;
    }
    public int tahmin(){
        System.out.println("lutfen 1-10 arasi bir sayi tahmin edin .");
        Scanner klavye=new Scanner(System.in);
      int  tahminim=klavye.nextInt();
    return tahminim;
    }
}
