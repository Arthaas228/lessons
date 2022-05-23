package lesson10.abstractfirstexample;

public class PostgreSQLProvider extends DbProvider{
    public PostgreSQLProvider(String dbHost) {
        super(dbHost);
    }

    @Override
    void connectToDb(){

    }
    @Override
    void disconnectFromDb(){

    }
}
