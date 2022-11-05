/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettersetter;

/**
 *
 * @author selami
 */
public class insan {
    private String isim;
    private int yas ;
    private int boy;

    public insan(String isim, int yas, int boy) {
        this.isim = isim;
        this.yas = yas;
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>0 &&yas<100){
        
        this.yas = yas;
        }
        else 
            System.out.println("lutfen yasinizi tam sayi olarak dogru giriniz!!!");
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    
}
