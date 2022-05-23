package lesson10.abstractfirstexample;

public abstract class DbProvider {
    private String dbHost;
    abstract void connectToDb();

    public DbProvider(String dbHost) {
        this.dbHost = dbHost;
    }

    abstract void disconnectFromDb();


    void printDbHost(){
        System.out.println("DB host is" + dbHost);

    }
}
