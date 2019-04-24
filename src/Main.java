public class Main {
    public static void main(String[] args)
    {
        Factory factory = new Factory();
//        Document doc = factory.createDocument(ClassTypes.DOCUMENT);
//        doc.toString();
        Document outgoing = factory.createDocument(ClassTypes.OUTGOING);
 //       outgoing.print();
        String str = outgoing.toString();
        System.out.println(str);
    }
}
