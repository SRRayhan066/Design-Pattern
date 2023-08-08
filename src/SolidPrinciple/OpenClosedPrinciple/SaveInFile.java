package SolidPrinciple.OpenClosedPrinciple;

public class SaveInFile implements InformationSave{
    @Override
    public void save(String fileName) {
        System.out.println(fileName+" is saved in file.");
    }
}
