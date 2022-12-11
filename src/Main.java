import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name document with format .doc, .xml, .txt");
        String name = in.nextLine();
        if (name.contains("xml")) {
            XMLHandler xml = new XMLHandler(name);
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        } else if (name.contains("txt")) {
            TXTHandler txt = new TXTHandler(name);
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        } else if (name.contains("doc")) {
            DOCHandler doc = new DOCHandler(name);
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        }
        else System.out.println("This format is not correct");
    }
}