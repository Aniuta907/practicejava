import java.util.Random;

public class Factory {

    public Factory(){

    }

    public Document createDocument(ClassTypes type){
        Document toReturn = null;

        switch (type) {
            case DOCUMENT:
                toReturn = new Document();
                break;
            case TASK:
                toReturn = new Task();
                break;
            case INCOMING:
                toReturn = new Incoming();
                break;
            case OUTGOING:
                toReturn = new Outgoing("Смирнов","express");
                break;
            default:
//                throw new DocumentExistsException("Document with this number already exists");
        }
        return toReturn;
    }

}
