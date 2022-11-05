package Logger;

public class Maillogger implements Ilogger{
    @Override
    public void log(String name) {
        System.out.println("sisteme mail gonderildi.");
    }
}
