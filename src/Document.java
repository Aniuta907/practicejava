 public class Document {
         int documentID; //идентификатор документа
         String documentName; //название документа
         String documentText; //текст документа
         int regNumber; //регистрационный номер документа
         String dataReg; //дата регистрации документа
         String authorName; //автор документа

         public Document(){

         }
         public Document(int documentID, String documentName,  String documentText, int regNumber,  String dataReg,  String authorName) {
                 this.documentID = documentID;
                 this.documentName = documentName;
                 this.documentText = documentText;
                 this.regNumber = regNumber;
                 this.dataReg = dataReg;
                 this.authorName = authorName;
         }

         public String toString() {
             final StringBuffer sb = new StringBuffer("Document{");
             sb.append("documentID=").append(documentID);
             sb.append(", documentName=").append(documentName);
             sb.append(", documentText='").append(documentText).append('\'');
             sb.append(", regNumber=").append(regNumber);
             sb.append(", dataReg=").append(dataReg);
             sb.append(", authorName=").append(authorName);
             sb.append('}');
             return sb.toString();
         }

 }