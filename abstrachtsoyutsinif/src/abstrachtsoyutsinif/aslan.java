/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrachtsoyutsinif;

/**
 *
 * @author selami
 */
public class aslan extends hayvanlar{
    //owerride edilmeli bu sinif artik
    String renk;
//cunku hayvanlar sinifi abstract yapisinda 
    @Override
    public void hareketet() {
        System.out.println("aslan hareket ediyor");
    }
    
     
}
