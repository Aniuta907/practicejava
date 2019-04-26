public class Outgoing extends Document {
    String recipient; //адресат
    String deliveryMethod; //способ доставки

    public Outgoing(){

    }

    public Outgoing(String recipient, String deliveryMethod) {
        this.recipient = recipient;
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incoming{");
        sb.append("recipient=").append(recipient);
        sb.append(", deliveryMethod=").append(deliveryMethod);
        sb.append('}');
        return sb.toString();
    }


}
