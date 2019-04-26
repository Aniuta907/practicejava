import java.util.Calendar;
import java.util.Random;
import java.util.Arrays;

public class Factory {

    private static int[] taskArray = new int [100];
    static int taskIndex = 0;

    private static int[] incomingArray = new int [100];
    static int incomingIndex = 0;

    private static int[] outgoingArray = new int [100];
    static int outgoingIndex = 0;

    public Factory(){

    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    public void setTaskArray() {
        for (int i = 0; i < taskArray.length; i++)
            taskArray[i] = -1;
    }

    public void getTaskArray() {
        for (int i = 0; i < taskArray.length; i++)
        System.out.print(" "+taskArray[i]);
    }

    public static Document createDocument(ClassTypes type) throws DocumentExistsException{
        Document doc = null;
        Random random = new Random();
        boolean flag = false;
        int rnd;
        int time;

        switch (type) {
            case TASK:
                doc = new Task();

               while (flag == false) {
                   bubbleSort(taskArray);
                    rnd = random.nextInt(100);

                   if (Arrays.binarySearch(taskArray, rnd) >= 0){
                       System.out.println(rnd);
                       throw new DocumentExistsException("Document with this number already exists");
                   }
                    else {
                        doc.setID(rnd);
                        taskArray[taskIndex] = rnd;
                        taskIndex++;
                        //System.out.println(doc.getID());
                        flag = true;
                    }
               }
                time = random.nextInt(100);
                ((Task)doc).setexecutionTime(time);
                break;

            case INCOMING:
                doc = new Incoming();
                break;

            case OUTGOING:
                doc = new Outgoing();
                break;
        }
        return doc;
    }

}
