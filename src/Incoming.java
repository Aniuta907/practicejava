import java.text.DateFormat;
import java.util.Date;

public class Incoming extends Document {
    String sender; //отправитель
    String recipient; //адресат
    int outgoingNumber; //исходящий номер
    DateFormat outgoingDataReg; //исходящая дата регистрации

    public Incoming(){

    }

    public Incoming(String sender, String recipient, int outgoingNumber,  DateFormat outgoingDataReg) {
        this.sender = sender;
        this.recipient = recipient;
        this.outgoingNumber = outgoingNumber;
        this.outgoingDataReg = outgoingDataReg;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incoming{");
        sb.append("sender=").append(sender);
        sb.append(", recipient=").append(recipient);
        sb.append(", outgoingNumber='").append(outgoingNumber).append('\'');
        sb.append(", outgoingDataReg=").append(outgoingDataReg);
        sb.append('}');
        return sb.toString();
    }
}
