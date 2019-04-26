import java.util.Calendar;

public class Task extends Document {
    private Calendar dataExtradition; //дата выдачи поручения
    private int executionTime; //срок исполнения поручения
    private String responsibleExecutive; //ответственный исполнитель
    private int signControl; // признак контрольности
    private String controllerInstructions; //контролер поручения

    public Task(){

    }

    public Task(Calendar  dataExtradition, int executionTime, String responsibleExecutive, int signControl,  String controllerInstructions) {
        this.dataExtradition = dataExtradition;
        this.executionTime = executionTime;
        this.responsibleExecutive = responsibleExecutive;
        this.signControl = signControl;
        this.controllerInstructions = controllerInstructions;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        if (id < 0) throw new IllegalArgumentException();
        this.id = id;
    }

    public void setdataExtradition(Calendar dataExtradition) {
        this.dataExtradition = dataExtradition;
    }

    public int getexecutionTime() {
        return executionTime;
    }

    public void setexecutionTime(int executionTime) {
        if (executionTime < 0) throw new IllegalArgumentException();
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("dataExtradition=").append(dataExtradition);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", responsibleExecutive='").append(responsibleExecutive).append('\'');
        sb.append(", signControl=").append(signControl);
        sb.append(", controllerInstructions=").append(controllerInstructions);
        sb.append('}');
        return sb.toString();
    }
}
