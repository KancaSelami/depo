
package eoopwithnlayeredapp.core.loging;


public class EmailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Mail gonderildi :"+data);
    }
    
}
