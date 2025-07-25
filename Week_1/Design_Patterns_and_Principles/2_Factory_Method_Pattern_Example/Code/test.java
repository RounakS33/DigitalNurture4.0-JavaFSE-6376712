import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter document type: ");
        String type = sc.nextLine();
        DocumentFactory factory;

        if(type.equalsIgnoreCase("word")){
            factory = new WordDocumentFactory();
        }
        else if(type.equalsIgnoreCase("pdf")){
            factory = new PdfDocumentFactory();
        }
        else if(type.equalsIgnoreCase("excel")){
            factory = new ExcelDocumentFactory();
        }
        else{
            System.out.println("Invalid document type.");
            sc.close();
            return;
        }

        Document doc = factory.createDocument();
        doc.open();
        sc.close();
    }
}
