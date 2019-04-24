public class Task extends Document {
    String dataExtradition; //дата выдачи поручения
    int executionTime; //срок исполнения поручения
    String responsibleExecutive; //ответственный исполнитель
    int signControl; // признак контрольности
    String controllerInstructions; //контролер поручения

    public Task(){

    }

    public Task(String  dataExtradition, int executionTime, String responsibleExecutive, int signControl,  String controllerInstructions) {
        this.dataExtradition = dataExtradition;
        this.executionTime = executionTime;
        this.responsibleExecutive = responsibleExecutive;
        this.signControl = signControl;
        this.controllerInstructions = controllerInstructions;
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
