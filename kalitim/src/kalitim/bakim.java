/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim;

/**
 *
 * @author selami
 */
public class bakim {
     int maximumhiz;
    String renk;
    float agirlik ;
    int model ;
    boolean bakim ;
    boolean hasarvarmi;
    boolean motoriyimi;

    public int getMaximumhiz() {
        return maximumhiz;
    }

    public void setMaximumhiz(int maximumhiz) {
        this.maximumhiz = maximumhiz;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public float getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(float agirlik) {
        this.agirlik = agirlik;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public boolean isBakim() {
        return bakim;
    }

    public void setBakim(boolean bakim) {
        this.bakim = bakim;
    }

    public boolean isHasarvarmi() {
        return hasarvarmi;
    }

    public void setHasarvarmi(boolean hasarvarmi) {
        this.hasarvarmi = hasarvarmi;
    }

    public boolean isMotoriyimi() {
        return motoriyimi;
    }

    public void setMotoriyimi(boolean motoriyimi) {
        this.motoriyimi = motoriyimi;
    }
    public void hasarlimi(){
        System.out.println(hasarvarmi);
    };
    public void bakimiyapildimi(){
        System.out.println(bakim);
    
    }
    public void motoriyimi(){
    
    }
}
