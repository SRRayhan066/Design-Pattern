package SolidPrinciple.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        InformationSave database = new SaveInDatabase();
        InformationSave file = new SaveInFile();

        database.save("File1");
        file.save("File1");
    }
}
