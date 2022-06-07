package lesson11.bigInterfaceExample;

public class SimpleReader implements Readable{
    @Override
    public void readFileStorage(Storage storage) {
        for(File file : storage.getFiles()){
            System.out.println(file.getName());
        }


    }
}
