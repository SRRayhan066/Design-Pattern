package AdapterDesignPattern;

public class Client {
    JSON json = new JSON("json data");
    IAdapter iAdapter = new JsonToXmlAdapter(json);
    XML xml = iAdapter.convert(json);
}
