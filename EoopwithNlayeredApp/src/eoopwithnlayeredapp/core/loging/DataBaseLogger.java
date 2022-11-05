/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eoopwithnlayeredapp.core.loging;

/**
 *
 * @author selami
 */
public class DataBaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Veritabanina loglandi: "+data);
    }
    
}
