import java.text.DateFormat;

public abstract class Document {
         public int id; //идентификатор документа
         public String documentName; //название документа
         public String documentText; //текст документа
         public int regNumber; //регистрационный номер документа
         public DateFormat dataReg; //дата регистрации документа
         public String authorName; //автор документа

         public Document(){}

         public Document(int id){
             this.id = id;
         }

         public Document(int id, String documentName,  String documentText, int regNumber,  DateFormat dataReg,  String authorName) {
                 this.id = id;
                 this.documentName = documentName;
                 this.documentText = documentText;
                 this.regNumber = regNumber;
                 this.dataReg = dataReg;
                 this.authorName = authorName;
         }

        public int getID() {
            return id;
        }

        public void setID(int id) {
            if (id < 0) throw new IllegalArgumentException();
            this.id = id;
        }

         public String toString() {
             final StringBuffer sb = new StringBuffer("Document{");
             sb.append("documentID=").append(id);
             sb.append(", documentName=").append(documentName);
             sb.append(", documentText='").append(documentText).append('\'');
             sb.append(", regNumber=").append(regNumber);
             sb.append(", dataReg=").append(dataReg);
             sb.append(", authorName=").append(authorName);
             sb.append('}');
             return sb.toString();
         }

 }