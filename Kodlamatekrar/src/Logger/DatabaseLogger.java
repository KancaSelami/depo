package Logger;

public class DatabaseLogger implements  Ilogger{
    @Override
    public void log(String name) {
        System.out.println("DataBase Loglandi.");
    }
}
