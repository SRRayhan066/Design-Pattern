package AdapterDesignPattern;

public class JSON {
    public JSON(){}
    public JSON(String data){}
    XML converterToXML(){
        return new XML("Stringified JSON data");
    }
}
