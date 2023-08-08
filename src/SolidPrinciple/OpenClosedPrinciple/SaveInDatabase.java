package SolidPrinciple.OpenClosedPrinciple;

public class SaveInDatabase implements InformationSave{
    @Override
    public void save(String fileName) {
        System.out.println(fileName+" is saved in Database.");
    }
}
