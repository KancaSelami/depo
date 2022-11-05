package Logger;

public class FileLogger implements Ilogger{
    @Override
    public void log(String name) {
        System.out.println("Dosyaya loglandi: "+ name);
    }
}
