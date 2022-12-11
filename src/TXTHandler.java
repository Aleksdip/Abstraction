public class TXTHandler extends AbstractHandler {
    String name;

    public TXTHandler(String name) {
        this.name = name;
    }
    void open() {
        System.out.println("File " + name + " open");
    }
    void create() {
        System.out.println("File " + name + " create");
    }
    void change() {
        System.out.println("File " + name + " change");
    }
    void save() {
        System.out.println("File " + name + " save");
    }
}
